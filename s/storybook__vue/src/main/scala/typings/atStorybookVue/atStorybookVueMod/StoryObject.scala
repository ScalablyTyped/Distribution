package typings.atStorybookVue.atStorybookVueMod

import typings.vue.typesOptionsMod.ComponentOptions
import typings.vue.typesOptionsMod.DefaultComputed
import typings.vue.typesOptionsMod.DefaultData
import typings.vue.typesOptionsMod.DefaultMethods
import typings.vue.typesOptionsMod.DefaultProps
import typings.vue.typesOptionsMod.PropsDefinition
import typings.vue.typesVueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoryObject extends js.Object {
  var name: String = js.native
  @JSName("render")
  var render_Original: StoryFunction = js.native
  def render(): (ComponentOptions[
    Vue, 
    DefaultData[Vue], 
    DefaultMethods[Vue], 
    DefaultComputed, 
    PropsDefinition[DefaultProps], 
    DefaultProps
  ]) | String = js.native
}

