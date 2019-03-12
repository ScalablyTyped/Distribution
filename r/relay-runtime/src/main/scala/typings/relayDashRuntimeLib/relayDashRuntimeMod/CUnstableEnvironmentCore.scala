package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CUnstableEnvironmentCore[TEnvironment, TFragment, TGraphQLTaggedNode, TNode, TOperation] extends js.Object {
  /**
    * Determine if two selectors are equal (represent the same selection). Note
    * that this function returns `false` when the two queries/fragments are
    * different objects, even if they select the same fields.
    */
  def areEqualSelectors(a: CSelector[TNode], b: CSelector[TNode]): scala.Boolean
  /**
    * Create an instance of a FragmentSpecResolver.
    *
    * TODO: The FragmentSpecResolver *can* be implemented via the other methods
    * defined here, so this could be moved out of core. It's convenient to have
    * separate implementations until the experimental core is in OSS.
    */
  def createFragmentSpecResolver(
    context: CRelayContext[TEnvironment],
    containerName: java.lang.String,
    fragments: CFragmentMap[TFragment],
    props: Props,
    callback: js.Function0[scala.Unit]
  ): FragmentSpecResolver
  /**
    * Creates an instance of an OperationSelector given an operation definition
    * (see `getOperation`) and the variables to apply. The input variables are
    * filtered to exclude variables that do not matche defined arguments on the
    * operation, and default values are populated for null values.
    */
  def createOperationSelector(operation: TOperation, variables: Variables): COperationSelector[TNode, TOperation]
  /**
    * Given a mapping of keys -> results and a mapping of keys -> fragments,
    * extracts a mapping of keys -> id(s) of the results.
    *
    * Similar to `getSelectorsFromObject()`, this function can be useful in
    * determining the "identity" of the props passed to a component.
    */
  def getDataIDsFromObject(fragments: CFragmentMap[TFragment], props: Props): org.scalablytyped.runtime.StringDictionary[js.UndefOr[DataID | js.Array[DataID] | scala.Null]]
  /**
    * Given a graphql`...` tagged template, extract a fragment definition usable
    * by this version of Relay core. Throws if the value is not a fragment.
    */
  def getFragment(node: TGraphQLTaggedNode): TFragment
  /**
    * Given a graphql`...` tagged template, extract an operation definition
    * usable by this version of Relay core. Throws if the value is not an
    * operation.
    */
  def getOperation(node: TGraphQLTaggedNode): TOperation
  /**
    * Given the result `item` from a parent that fetched `fragment`, creates a
    * selector that can be used to read the results of that fragment for that item.
    *
    * Example:
    *
    * Given two fragments as follows:
    *
    * ```
    * fragment Parent on User {
    *   id
    *   ...Child
    * }
    * fragment Child on User {
    *   name
    * }
    * ```
    *
    * And given some object `parent` that is the results of `Parent` for id "4",
    * the results of `Child` can be accessed by first getting a selector and then
    * using that selector to `lookup()` the results against the environment:
    *
    * ```
    * const childSelector = getSelector(queryVariables, Child, parent);
    * const childData = environment.lookup(childSelector).data;
    * ```
    */
  def getSelector(operationVariables: Variables, fragment: TFragment, prop: js.Any): CSelector[TNode] | scala.Null
  /**
    * Given the result `items` from a parent that fetched `fragment`, creates a
    * selector that can be used to read the results of that fragment on those
    * items. This is similar to `getSelector` but for "plural" fragments that
    * expect an array of results and therefore return an array of selectors.
    */
  def getSelectorList(operationVariables: Variables, fragment: TFragment, props: js.Array[_]): js.Array[CSelector[TNode]] | scala.Null
  /**
    * Given a mapping of keys -> results and a mapping of keys -> fragments,
    * extracts the selectors for those fragments from the results.
    *
    * The canonical use-case for this function are Relay Containers, which
    * use this function to convert (props, fragments) into selectors so that they
    * can read the results to pass to the inner component.
    */
  def getSelectorsFromObject(operationVariables: Variables, fragments: CFragmentMap[TFragment], props: Props): org.scalablytyped.runtime.StringDictionary[js.UndefOr[CSelector[TNode] | js.Array[CSelector[TNode]] | scala.Null]]
  /**
    * Given a mapping of keys -> results and a mapping of keys -> fragments,
    * extracts the merged variables that would be in scope for those
    * fragments/results.
    *
    * This can be useful in determing what varaibles were used to fetch the data
    * for a Relay container, for example.
    */
  def getVariablesFromObject(operationVariables: Variables, fragments: CFragmentMap[TFragment], props: Props): Variables
}

object CUnstableEnvironmentCore {
  @scala.inline
  def apply[TEnvironment, TFragment, TGraphQLTaggedNode, TNode, TOperation](
    areEqualSelectors: (CSelector[TNode], CSelector[TNode]) => scala.Boolean,
    createFragmentSpecResolver: (CRelayContext[TEnvironment], java.lang.String, CFragmentMap[TFragment], Props, js.Function0[scala.Unit]) => FragmentSpecResolver,
    createOperationSelector: (TOperation, Variables) => COperationSelector[TNode, TOperation],
    getDataIDsFromObject: (CFragmentMap[TFragment], Props) => org.scalablytyped.runtime.StringDictionary[js.UndefOr[DataID | js.Array[DataID] | scala.Null]],
    getFragment: TGraphQLTaggedNode => TFragment,
    getOperation: TGraphQLTaggedNode => TOperation,
    getSelector: (Variables, TFragment, js.Any) => CSelector[TNode] | scala.Null,
    getSelectorList: (Variables, TFragment, js.Array[_]) => js.Array[CSelector[TNode]] | scala.Null,
    getSelectorsFromObject: (Variables, CFragmentMap[TFragment], Props) => org.scalablytyped.runtime.StringDictionary[js.UndefOr[CSelector[TNode] | js.Array[CSelector[TNode]] | scala.Null]],
    getVariablesFromObject: (Variables, CFragmentMap[TFragment], Props) => Variables
  ): CUnstableEnvironmentCore[TEnvironment, TFragment, TGraphQLTaggedNode, TNode, TOperation] = {
    val __obj = js.Dynamic.literal(areEqualSelectors = js.Any.fromFunction2(areEqualSelectors), createFragmentSpecResolver = js.Any.fromFunction5(createFragmentSpecResolver), createOperationSelector = js.Any.fromFunction2(createOperationSelector), getDataIDsFromObject = js.Any.fromFunction2(getDataIDsFromObject), getFragment = js.Any.fromFunction1(getFragment), getOperation = js.Any.fromFunction1(getOperation), getSelector = js.Any.fromFunction3(getSelector), getSelectorList = js.Any.fromFunction3(getSelectorList), getSelectorsFromObject = js.Any.fromFunction3(getSelectorsFromObject), getVariablesFromObject = js.Any.fromFunction3(getVariablesFromObject))
  
    __obj.asInstanceOf[CUnstableEnvironmentCore[TEnvironment, TFragment, TGraphQLTaggedNode, TNode, TOperation]]
  }
}

