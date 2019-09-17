package typings.reactDashWithDashStyles.reactDashWithDashStylesMod

import typings.propDashTypes.propDashTypesMod.ValidationMap
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.reactDashWithDashStyles.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-with-styles", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val withStylesPropTypes: ValidationMap[WithStylesProps[Theme]] = js.native
  def css(styles: js.Any*): js.Object = js.native
  def withStyles[T](): js.Function1[
    /* component */ ComponentType[_], 
    ComponentClass[Omit[ElementConfig[ComponentType[_]], String], ComponentState]
  ] = js.native
  def withStyles[T](styleFn: js.Function1[/* theme */ T, Styles]): js.Function1[
    /* component */ ComponentType[_], 
    ComponentClass[Omit[ElementConfig[ComponentType[_]], String], ComponentState]
  ] = js.native
  def withStyles[T](styleFn: js.Function1[/* theme */ T, Styles], options: WithStylesOptions): js.Function1[
    /* component */ ComponentType[_], 
    ComponentClass[Omit[ElementConfig[ComponentType[_]], String], ComponentState]
  ] = js.native
  def withStyles[T](styleFn: Null, options: WithStylesOptions): js.Function1[
    /* component */ ComponentType[_], 
    ComponentClass[Omit[ElementConfig[ComponentType[_]], String], ComponentState]
  ] = js.native
}

