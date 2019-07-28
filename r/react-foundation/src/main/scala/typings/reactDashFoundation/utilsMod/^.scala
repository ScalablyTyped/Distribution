package typings.reactDashFoundation.utilsMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashFoundation.Anon_Clearfix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-foundation/utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addBreakpoint(prop: String, size: String): String = js.native
  def createClassName(args: js.Any*): String = js.native
  def flexboxClassNames(props: FlexboxPropTypes): StringDictionary[js.UndefOr[Boolean]] = js.native
  def generalClassNames(props: GeneralPropTypes): Anon_Clearfix = js.native
  def isDefined(value: js.Any): Boolean = js.native
  def objectKeys(`object`: js.Object): js.Array[String] = js.native
  def objectValues(`object`: js.Object): js.Array[_] = js.native
  def removeProps(`object`: js.Object, remove: js.Array[String]): js.Object = js.native
  def setDirection(): String = js.native
  def setDirection(isVertical: Boolean): String = js.native
  def setDirection(isVertical: Boolean, gutters: String): String = js.native
}

