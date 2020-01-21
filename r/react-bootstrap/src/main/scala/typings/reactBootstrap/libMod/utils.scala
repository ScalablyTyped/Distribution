package typings.reactBootstrap.libMod

import typings.reactBootstrap.AnonBsClass
import typings.reactBootstrap.bootstrapUtilsMod.BSProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-bootstrap/lib", "utils")
@js.native
object utils extends js.Object {
  def createChainedFunction(funcs: js.Function*): js.Function = js.native
  @js.native
  object bootstrapUtils extends js.Object {
    def addStyle(Component: js.Any, styleVariant: js.Any*): js.Any = js.native
    def bsClass(defaultClass: js.Any, Component: js.Any): js.Any = js.native
    def bsSizes(sizes: js.Any, defaultSize: js.Any, Component: js.Any): js.Any = js.native
    def bsStyles(styles: js.Any, defaultStyle: js.Any, Component: js.Any): js.Any = js.native
    def getBsProps(props: js.Any): BSProps = js.native
    def getClassSet(props: js.Any): js.Any = js.native
    def isBsProp(propName: String): Boolean = js.native
    def prefix(props: AnonBsClass): String = js.native
    def prefix(props: AnonBsClass, variant: String): String = js.native
    def splitBsProps(props: js.Any): js.Tuple2[BSProps, _] = js.native
    def splitBsPropsAndOmit(props: js.Any, omittedPropNames: js.Any): js.Tuple2[BSProps, _] = js.native
  }
  
}

