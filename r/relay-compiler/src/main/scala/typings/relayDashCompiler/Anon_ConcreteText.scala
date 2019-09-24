package typings.relayDashCompiler

import typings.relayDashCompiler.libCoreGraphQLIRMod.GeneratedDefinition
import typings.relayDashCompiler.relayDashCompilerStrings.Fragment
import typings.relayDashCompiler.relayDashCompilerStrings.Request
import typings.relayDashRuntime.libUtilRelayConcreteNodeMod.GeneratedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConcreteText extends js.Object {
  /**
    * The IR for the document that this module represents.
    */
  var concreteText: String
  /**
    * The IR node from which the generated node is derived.
    */
  var definition: GeneratedDefinition
  /**
    * The actual document that this module represents.
    */
  var docText: Null | String
  /**
    * The type of artifact that this module represents.
    *
    * @todo Document when this can be `empty`.
    */
  var documentType: Fragment | Request | Null
  /**
    * A hash of the concrete node including the query text.
    *
    * @todo Document how this is different from `sourceHash`.
    */
  var hash: Null | String
  /**
    * The 'kind' of the generated node.
    */
  var kind: String
  /**
    * The filename of the module.
    */
  var moduleName: String
  /**
    * The generated node being written.
    */
  var node: GeneratedNode
  /**
    * A hash of the document, which is used by relay-compiler to know if it needs
    * to write a new version of the artifact.
    *
    * @todo Is this correct? And document how this is different from `hash`.
    */
  var sourceHash: String
  /**
    * The type information generated for the GraphQL selections made.
    */
  var typeText: String
}

object Anon_ConcreteText {
  @scala.inline
  def apply(
    concreteText: String,
    definition: GeneratedDefinition,
    kind: String,
    moduleName: String,
    node: GeneratedNode,
    sourceHash: String,
    typeText: String,
    docText: String = null,
    documentType: Fragment | Request = null,
    hash: String = null
  ): Anon_ConcreteText = {
    val __obj = js.Dynamic.literal(concreteText = concreteText, definition = definition, kind = kind, moduleName = moduleName, node = node, sourceHash = sourceHash, typeText = typeText)
    if (docText != null) __obj.updateDynamic("docText")(docText)
    if (documentType != null) __obj.updateDynamic("documentType")(documentType.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash)
    __obj.asInstanceOf[Anon_ConcreteText]
  }
}

