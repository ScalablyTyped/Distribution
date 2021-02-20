package typings.reactBootstrap.mod

import typings.reactBootstrap.anon.BsClass
import typings.reactBootstrap.bootstrapUtilsMod.BSProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utils {
  
  object bootstrapUtils {
    
    @JSImport("react-bootstrap", "utils.bootstrapUtils.addStyle")
    @js.native
    def addStyle(Component: js.Any, styleVariant: js.Any*): js.Any = js.native
    
    @JSImport("react-bootstrap", "utils.bootstrapUtils.bsClass")
    @js.native
    def bsClass(defaultClass: js.Any, Component: js.Any): js.Any = js.native
    
    @JSImport("react-bootstrap", "utils.bootstrapUtils.bsSizes")
    @js.native
    def bsSizes(sizes: js.Any, defaultSize: js.Any, Component: js.Any): js.Any = js.native
    
    @JSImport("react-bootstrap", "utils.bootstrapUtils.bsStyles")
    @js.native
    def bsStyles(styles: js.Any, defaultStyle: js.Any, Component: js.Any): js.Any = js.native
    
    @JSImport("react-bootstrap", "utils.bootstrapUtils.getBsProps")
    @js.native
    def getBsProps(props: js.Any): BSProps = js.native
    
    @JSImport("react-bootstrap", "utils.bootstrapUtils.getClassSet")
    @js.native
    def getClassSet(props: js.Any): js.Any = js.native
    
    @JSImport("react-bootstrap", "utils.bootstrapUtils.isBsProp")
    @js.native
    def isBsProp(propName: String): Boolean = js.native
    
    @JSImport("react-bootstrap", "utils.bootstrapUtils.prefix")
    @js.native
    def prefix(props: BsClass): String = js.native
    @JSImport("react-bootstrap", "utils.bootstrapUtils.prefix")
    @js.native
    def prefix(props: BsClass, variant: String): String = js.native
    
    @JSImport("react-bootstrap", "utils.bootstrapUtils.splitBsProps")
    @js.native
    def splitBsProps(props: js.Any): js.Tuple2[BSProps, _] = js.native
    
    @JSImport("react-bootstrap", "utils.bootstrapUtils.splitBsPropsAndOmit")
    @js.native
    def splitBsPropsAndOmit(props: js.Any, omittedPropNames: js.Any): js.Tuple2[BSProps, _] = js.native
  }
  
  @JSImport("react-bootstrap", "utils.createChainedFunction")
  @js.native
  def createChainedFunction(funcs: js.Function*): js.Function = js.native
}
