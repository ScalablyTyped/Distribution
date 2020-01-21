package typings.relayCompiler.relayLanguagePluginInterfaceMod

import typings.relayCompiler.AnonColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLTag extends js.Object {
  /**
    * In the case this tag was part of a fragment container and it used a node
    * map as fragment spec, rather than a single tagged node, this should hold
    * the prop key to which the node is assigned.
    *
    * @example
    *
    *  createFragmentContainer(
    *    MyComponent,
    *    {
    *      keyName: graphql`fragment MyComponent_keyName { … }`
    *    }
    *  )
    *
    */
  var keyName: Null | String
  /**
    * The location in the source file that the tag is placed at.
    */
  var sourceLocationOffset: AnonColumn
  /**
    * Should hold the string content of the `graphql` tagged template literal,
    * which is either an operation or fragment.
    *
    * @example
    *
    *  grapqhl`query MyQuery { … }`
    *  grapqhl`fragment MyFragment on MyType { … }`
    */
  var template: String
}

object GraphQLTag {
  @scala.inline
  def apply(sourceLocationOffset: AnonColumn, template: String, keyName: String = null): GraphQLTag = {
    val __obj = js.Dynamic.literal(sourceLocationOffset = sourceLocationOffset.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    if (keyName != null) __obj.updateDynamic("keyName")(keyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLTag]
  }
}

