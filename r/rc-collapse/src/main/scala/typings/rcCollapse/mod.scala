package typings.rcCollapse

import typings.rcCollapse.anon.PartialCollapsePropsRefAt
import typings.rcCollapse.anon.WeakValidationMapCollapse
import typings.rcCollapse.esInterfaceMod.CollapsePanelProps
import typings.rcCollapse.esInterfaceMod.CollapseProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Inlined react.react.ForwardRefExoticComponent<rc-collapse.rc-collapse/es/interface.CollapseProps & react.react.RefAttributes<std.HTMLDivElement>> & {  Panel :react.react.ForwardRefExoticComponent<rc-collapse.rc-collapse/es/interface.CollapsePanelProps & react.react.RefAttributes<std.HTMLDivElement>>} */
  object default {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    inline def apply(props: CollapseProps & RefAttributes[HTMLDivElement]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    @JSImport("rc-collapse", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @deprecated use `items` instead, will be removed in `v4.0.0`
      */
    @JSImport("rc-collapse", "default.Panel")
    @js.native
    def Panel: ForwardRefExoticComponent[CollapsePanelProps & RefAttributes[HTMLDivElement]] = js.native
    inline def Panel_=(x: ForwardRefExoticComponent[CollapsePanelProps & RefAttributes[HTMLDivElement]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Panel")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-collapse", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialCollapsePropsRefAt] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialCollapsePropsRefAt]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-collapse", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-collapse", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapCollapse] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapCollapse]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-collapse", "default.$$typeof")
    @js.native
    val typeof: js.Symbol = js.native
  }
  
  @JSImport("rc-collapse", "Panel")
  @js.native
  val Panel: ForwardRefExoticComponent[CollapsePanelProps & RefAttributes[HTMLDivElement]] = js.native
}
