package typings.reactNative.mod

import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.GetDerivedStateFromError
import typings.react.mod.GetDerivedStateFromProps
import typings.react.mod.ValidationMap
import typings.react.mod.WeakValidationMap
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("react-native", "YellowBox")
@js.native
open class YellowBox protected () extends Component[Any, Any, Any] {
  def this(props: Any) = this()
  def this(props: Any, context: Any) = this()
}
/* Inlined react.react.ComponentClass<any, any> & {ignoreWarnings (warnings : std.Array<string>): void} */
object YellowBox {
  
  @JSImport("react-native", "YellowBox")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native", "YellowBox.childContextTypes")
  @js.native
  def childContextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def childContextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "YellowBox.contextType")
  @js.native
  def contextType: js.UndefOr[Context[Any]] = js.native
  inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "YellowBox.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "YellowBox.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[Partial[Any]] = js.native
  inline def defaultProps_=(x: js.UndefOr[Partial[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "YellowBox.displayName")
  @js.native
  def displayName: js.UndefOr[String] = js.native
  inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "YellowBox.getDerivedStateFromError")
  @js.native
  def getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[Any, Any]] = js.native
  inline def getDerivedStateFromError_=(x: js.UndefOr[GetDerivedStateFromError[Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native", "YellowBox.getDerivedStateFromProps")
  @js.native
  def getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[Any, Any]] = js.native
  inline def getDerivedStateFromProps_=(x: js.UndefOr[GetDerivedStateFromProps[Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
  
  inline def ignoreWarnings(warnings: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ignoreWarnings")(warnings.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("react-native", "YellowBox.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMap[Any]] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
