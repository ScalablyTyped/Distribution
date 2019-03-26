package typings
package atRebassGridLib.atRebassGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof react.react.React.ComponentPropsWithRef<'div'> ]: P} & {[ P in 'color' | 'is' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.React.ComponentPropsWithRef<'div'>] ]: react.react.React.ComponentPropsWithRef<'div'>[P]} */ trait BoxProps extends CommonProps {
  var alignSelf: js.UndefOr[ResponsiveProp] = js.undefined
  var flex: js.UndefOr[ResponsiveProp] = js.undefined
  var is: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ComponentType[_]] = js.undefined
  var order: js.UndefOr[ResponsiveProp] = js.undefined
}

object BoxProps {
  @scala.inline
  def apply(
    alignSelf: ResponsiveProp = null,
    bg: ResponsiveProp = null,
    color: ResponsiveProp = null,
    css: styledDashComponentsLib.styledDashComponentsMod.Interpolation[_] = null,
    flex: ResponsiveProp = null,
    fontSize: ResponsiveProp = null,
    is: java.lang.String | reactLib.reactMod.ReactNs.ComponentType[_] = null,
    m: ResponsiveProp = null,
    mb: ResponsiveProp = null,
    ml: ResponsiveProp = null,
    mr: ResponsiveProp = null,
    mt: ResponsiveProp = null,
    mx: ResponsiveProp = null,
    my: ResponsiveProp = null,
    order: ResponsiveProp = null,
    p: ResponsiveProp = null,
    pb: ResponsiveProp = null,
    pl: ResponsiveProp = null,
    pr: ResponsiveProp = null,
    pt: ResponsiveProp = null,
    px: ResponsiveProp = null,
    py: ResponsiveProp = null,
    theme: js.Any = null,
    width: ResponsiveProp = null
  ): BoxProps = {
    val __obj = js.Dynamic.literal()
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (mb != null) __obj.updateDynamic("mb")(mb.asInstanceOf[js.Any])
    if (ml != null) __obj.updateDynamic("ml")(ml.asInstanceOf[js.Any])
    if (mr != null) __obj.updateDynamic("mr")(mr.asInstanceOf[js.Any])
    if (mt != null) __obj.updateDynamic("mt")(mt.asInstanceOf[js.Any])
    if (mx != null) __obj.updateDynamic("mx")(mx.asInstanceOf[js.Any])
    if (my != null) __obj.updateDynamic("my")(my.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (pb != null) __obj.updateDynamic("pb")(pb.asInstanceOf[js.Any])
    if (pl != null) __obj.updateDynamic("pl")(pl.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (pt != null) __obj.updateDynamic("pt")(pt.asInstanceOf[js.Any])
    if (px != null) __obj.updateDynamic("px")(px.asInstanceOf[js.Any])
    if (py != null) __obj.updateDynamic("py")(py.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxProps]
  }
}

