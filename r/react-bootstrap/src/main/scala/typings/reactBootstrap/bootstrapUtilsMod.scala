package typings.reactBootstrap

import typings.reactBootstrap.anon.BsClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bootstrapUtilsMod {
  
  @JSImport("react-bootstrap/lib/utils/bootstrapUtils", "addStyle")
  @js.native
  def addStyle(Component: js.Any, styleVariant: js.Any*): js.Any = js.native
  
  @JSImport("react-bootstrap/lib/utils/bootstrapUtils", "bsClass")
  @js.native
  def bsClass(defaultClass: js.Any, Component: js.Any): js.Any = js.native
  
  @JSImport("react-bootstrap/lib/utils/bootstrapUtils", "bsSizes")
  @js.native
  def bsSizes(sizes: js.Any, defaultSize: js.Any, Component: js.Any): js.Any = js.native
  
  @JSImport("react-bootstrap/lib/utils/bootstrapUtils", "bsStyles")
  @js.native
  def bsStyles(styles: js.Any, defaultStyle: js.Any, Component: js.Any): js.Any = js.native
  
  @JSImport("react-bootstrap/lib/utils/bootstrapUtils", "getBsProps")
  @js.native
  def getBsProps(props: js.Any): BSProps = js.native
  
  @JSImport("react-bootstrap/lib/utils/bootstrapUtils", "getClassSet")
  @js.native
  def getClassSet(props: js.Any): js.Any = js.native
  
  @JSImport("react-bootstrap/lib/utils/bootstrapUtils", "isBsProp")
  @js.native
  def isBsProp(propName: String): Boolean = js.native
  
  @JSImport("react-bootstrap/lib/utils/bootstrapUtils", "prefix")
  @js.native
  def prefix(props: BsClass): String = js.native
  @JSImport("react-bootstrap/lib/utils/bootstrapUtils", "prefix")
  @js.native
  def prefix(props: BsClass, variant: String): String = js.native
  
  @JSImport("react-bootstrap/lib/utils/bootstrapUtils", "splitBsProps")
  @js.native
  def splitBsProps(props: js.Any): js.Tuple2[BSProps, _] = js.native
  
  @JSImport("react-bootstrap/lib/utils/bootstrapUtils", "splitBsPropsAndOmit")
  @js.native
  def splitBsPropsAndOmit(props: js.Any, omittedPropNames: js.Any): js.Tuple2[BSProps, _] = js.native
  
  @js.native
  trait BSProps extends StObject {
    
    var bsClass: js.Any = js.native
    
    var bsRole: js.Any = js.native
    
    var bsSize: js.Any = js.native
    
    var bsStyle: js.Any = js.native
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
