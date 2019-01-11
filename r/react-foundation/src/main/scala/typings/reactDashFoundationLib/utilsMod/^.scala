package typings
package reactDashFoundationLib.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-foundation/utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val FlexboxPropTypes: reactDashFoundationLib.Anon_AlignXAlignY = js.native
  val GeneralPropTypes: reactDashFoundationLib.Anon_Float = js.native
  def addBreakpoint(prop: java.lang.String, size: java.lang.String): java.lang.String = js.native
  def createClassName(args: js.Any*): java.lang.String = js.native
  def flexboxClassNames(props: reactDashFoundationLib.utilsMod.FlexboxPropTypes): org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Boolean]] = js.native
  def generalClassNames(props: reactDashFoundationLib.utilsMod.GeneralPropTypes): reactDashFoundationLib.Anon_Clearfix = js.native
  def isDefined(value: js.Any): scala.Boolean = js.native
  def objectKeys(`object`: js.Object): js.Array[java.lang.String] = js.native
  def objectValues(`object`: js.Object): js.Array[_] = js.native
  def removeProps(`object`: js.Object, remove: js.Array[java.lang.String]): js.Object = js.native
  def setDirection(): java.lang.String = js.native
  def setDirection(isVertical: scala.Boolean): java.lang.String = js.native
  def setDirection(isVertical: scala.Boolean, gutters: java.lang.String): java.lang.String = js.native
}

