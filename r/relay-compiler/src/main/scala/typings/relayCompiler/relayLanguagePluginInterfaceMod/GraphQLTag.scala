package typings.relayCompiler.relayLanguagePluginInterfaceMod

import typings.relayCompiler.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var keyName: Null | String = js.native
  /**
    * The location in the source file that the tag is placed at.
    */
  var sourceLocationOffset: Column = js.native
  /**
    * Should hold the string content of the `graphql` tagged template literal,
    * which is either an operation or fragment.
    *
    * @example
    *
    *  grapqhl`query MyQuery { … }`
    *  grapqhl`fragment MyFragment on MyType { … }`
    */
  var template: String = js.native
}

object GraphQLTag {
  @scala.inline
  def apply(sourceLocationOffset: Column, template: String): GraphQLTag = {
    val __obj = js.Dynamic.literal(sourceLocationOffset = sourceLocationOffset.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLTag]
  }
  @scala.inline
  implicit class GraphQLTagOps[Self <: GraphQLTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSourceLocationOffset(value: Column): Self = this.set("sourceLocationOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyName(value: String): Self = this.set("keyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyNameNull: Self = this.set("keyName", null)
  }
  
}

