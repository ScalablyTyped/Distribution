package typings.reactWithStyles.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.reactWithStyles.reactWithStylesStrings.styles
import typings.reactWithStyles.reactWithStylesStrings.theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-with-styles", "withStyles")
@js.native
object withStyles extends js.Object {
  def apply[T](): js.Function1[
    /* component */ ComponentType[_], 
    ComponentClass[
      Omit[
        ElementConfig[ComponentType[_]], 
        typings.reactWithStyles.reactWithStylesStrings.css | styles | theme
      ], 
      ComponentState
    ]
  ] = js.native
  def apply[T](styleFn: js.Function1[/* theme */ T, Styles]): js.Function1[
    /* component */ ComponentType[_], 
    ComponentClass[
      Omit[
        ElementConfig[ComponentType[_]], 
        typings.reactWithStyles.reactWithStylesStrings.css | styles | theme
      ], 
      ComponentState
    ]
  ] = js.native
  def apply[T](styleFn: js.Function1[/* theme */ T, Styles], options: WithStylesOptions): js.Function1[
    /* component */ ComponentType[_], 
    ComponentClass[
      Omit[
        ElementConfig[ComponentType[_]], 
        typings.reactWithStyles.reactWithStylesStrings.css | styles | theme
      ], 
      ComponentState
    ]
  ] = js.native
  def apply[T](styleFn: Null, options: WithStylesOptions): js.Function1[
    /* component */ ComponentType[_], 
    ComponentClass[
      Omit[
        ElementConfig[ComponentType[_]], 
        typings.reactWithStyles.reactWithStylesStrings.css | styles | theme
      ], 
      ComponentState
    ]
  ] = js.native
}

