package typings.reactBootstrap

import typings.reactBootstrap.anon.BsClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bootstrapUtilsMod {
  
  @JSImport("react-bootstrap/lib/utils/bootstrapUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addStyle(Component: js.Any, styleVariant: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addStyle")(Component.asInstanceOf[js.Any], styleVariant.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def bsClass(defaultClass: js.Any, Component: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bsClass")(defaultClass.asInstanceOf[js.Any], Component.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def bsSizes(sizes: js.Any, defaultSize: js.Any, Component: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bsSizes")(sizes.asInstanceOf[js.Any], defaultSize.asInstanceOf[js.Any], Component.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def bsStyles(styles: js.Any, defaultStyle: js.Any, Component: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bsStyles")(styles.asInstanceOf[js.Any], defaultStyle.asInstanceOf[js.Any], Component.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def getBsProps(props: js.Any): BSProps = ^.asInstanceOf[js.Dynamic].applyDynamic("getBsProps")(props.asInstanceOf[js.Any]).asInstanceOf[BSProps]
  
  @scala.inline
  def getClassSet(props: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getClassSet")(props.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def isBsProp(propName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBsProp")(propName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def prefix(props: BsClass): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prefix")(props.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def prefix(props: BsClass, variant: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("prefix")(props.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def splitBsProps(props: js.Any): js.Tuple2[BSProps, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitBsProps")(props.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[BSProps, js.Any]]
  
  @scala.inline
  def splitBsPropsAndOmit(props: js.Any, omittedPropNames: js.Any): js.Tuple2[BSProps, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitBsPropsAndOmit")(props.asInstanceOf[js.Any], omittedPropNames.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[BSProps, js.Any]]
  
  trait BSProps extends StObject {
    
    var bsClass: js.Any
    
    var bsRole: js.Any
    
    var bsSize: js.Any
    
    var bsStyle: js.Any
  }
  object BSProps {
    
    @scala.inline
    def apply(bsClass: js.Any, bsRole: js.Any, bsSize: js.Any, bsStyle: js.Any): BSProps = {
      val __obj = js.Dynamic.literal(bsClass = bsClass.asInstanceOf[js.Any], bsRole = bsRole.asInstanceOf[js.Any], bsSize = bsSize.asInstanceOf[js.Any], bsStyle = bsStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[BSProps]
    }
    
    @scala.inline
    implicit class BSPropsMutableBuilder[Self <: BSProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: js.Any): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsRole(value: js.Any): Self = StObject.set(x, "bsRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsSize(value: js.Any): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsStyle(value: js.Any): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
    }
  }
}
