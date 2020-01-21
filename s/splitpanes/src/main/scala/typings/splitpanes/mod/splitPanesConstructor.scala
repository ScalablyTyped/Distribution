package typings.splitpanes.mod

import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait splitPanesConstructor extends VueConstructor[Vue] {
  var computed: splitPanesComputed = js.native
  var methods: splitPanesMethods = js.native
  var props: splitPanesProps = js.native
  var watch: splitPanesWatch = js.native
  def beforeDestroy(): Unit = js.native
  def beforeUpdate(): Unit = js.native
  def data(): splitPanesData = js.native
  def mounted(): Unit = js.native
  def render(createEl: js.Any): js.Any = js.native
}

