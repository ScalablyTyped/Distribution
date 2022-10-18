package typings.reactBootstrap.global.ReactBootstrap

import typings.reactBootstrap.anon.BsClass
import typings.reactBootstrap.libUtilsBootstrapUtilsMod.BSProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utils {
  
  @JSGlobal("ReactBootstrap.utils")
  @js.native
  val ^ : js.Any = js.native
  
  object bootstrapUtils {
    
    @JSGlobal("ReactBootstrap.utils.bootstrapUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addStyle(Component: Any, styleVariant: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addStyle")(scala.List(Component.asInstanceOf[js.Any]).`++`(styleVariant.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
    
    inline def bsClass(defaultClass: Any, Component: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bsClass")(defaultClass.asInstanceOf[js.Any], Component.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def bsSizes(sizes: Any, defaultSize: Any, Component: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bsSizes")(sizes.asInstanceOf[js.Any], defaultSize.asInstanceOf[js.Any], Component.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def bsStyles(styles: Any, defaultStyle: Any, Component: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bsStyles")(styles.asInstanceOf[js.Any], defaultStyle.asInstanceOf[js.Any], Component.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getBsProps(props: Any): BSProps = ^.asInstanceOf[js.Dynamic].applyDynamic("getBsProps")(props.asInstanceOf[js.Any]).asInstanceOf[BSProps]
    
    inline def getClassSet(props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getClassSet")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def isBsProp(propName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBsProp")(propName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def prefix(props: BsClass): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prefix")(props.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def prefix(props: BsClass, variant: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("prefix")(props.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def splitBsProps(props: Any): js.Tuple2[BSProps, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitBsProps")(props.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[BSProps, Any]]
    
    inline def splitBsPropsAndOmit(props: Any, omittedPropNames: Any): js.Tuple2[BSProps, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitBsPropsAndOmit")(props.asInstanceOf[js.Any], omittedPropNames.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[BSProps, Any]]
  }
  
  inline def createChainedFunction(funcs: js.Function*): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("createChainedFunction")(funcs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function]
}
