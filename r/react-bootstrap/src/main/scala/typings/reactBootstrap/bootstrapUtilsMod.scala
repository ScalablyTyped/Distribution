package typings.reactBootstrap

import typings.reactBootstrap.anon.BsClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bootstrapUtilsMod {
  
  @JSImport("react-bootstrap/lib/utils/bootstrapUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addStyle(Component: Any, styleVariant: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addStyle")(List(Component.asInstanceOf[js.Any]).`++`(styleVariant.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
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
  
  trait BSProps extends StObject {
    
    var bsClass: Any
    
    var bsRole: Any
    
    var bsSize: Any
    
    var bsStyle: Any
  }
  object BSProps {
    
    inline def apply(bsClass: Any, bsRole: Any, bsSize: Any, bsStyle: Any): BSProps = {
      val __obj = js.Dynamic.literal(bsClass = bsClass.asInstanceOf[js.Any], bsRole = bsRole.asInstanceOf[js.Any], bsSize = bsSize.asInstanceOf[js.Any], bsStyle = bsStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[BSProps]
    }
    
    extension [Self <: BSProps](x: Self) {
      
      inline def setBsClass(value: Any): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsRole(value: Any): Self = StObject.set(x, "bsRole", value.asInstanceOf[js.Any])
      
      inline def setBsSize(value: Any): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      inline def setBsStyle(value: Any): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
    }
  }
}
