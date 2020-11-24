package typings.skatejs.typesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("skatejs/types", "WithUpdate")
@js.native
class WithUpdate[P, S] () extends HTMLElement {
  
  // Special hack for own components type checking.
  // It works in combination with ElementAttributesProperty. It placed in jsx.d.ts.
  // more detail, see: https://www.typescriptlang.org/docs/handbook/jsx.html
  //               and https://github.com/skatejs/skatejs/pull/952#issuecomment-264500153
  val props: P = js.native
  
  // Called to check whether or not the component should call updated(), much like React's shouldComponentUpdate().
  def shouldUpdate(): Boolean = js.native
  def shouldUpdate(props: P): Boolean = js.native
  def shouldUpdate(props: P, state: S): Boolean = js.native
  def shouldUpdate(props: js.UndefOr[scala.Nothing], state: S): Boolean = js.native
  
  var state: S = js.native
  
  // manually force update
  def triggerUpdate(): Unit = js.native
  
  // Called if shouldUpdate returned true, much like React's componentWillUpdate()
  def updated(): Unit = js.native
  def updated(props: js.UndefOr[scala.Nothing], state: Mixed): Unit = js.native
  def updated(props: Mixed): Unit = js.native
  def updated(props: Mixed, state: Mixed): Unit = js.native
  
  // Called when props have been set regardless of if they've changed. much like React's componentWillReceiveProps().
  def updating(): Unit = js.native
  def updating(props: P): Unit = js.native
  def updating(props: P, state: S): Unit = js.native
  def updating(props: js.UndefOr[scala.Nothing], state: S): Unit = js.native
}
