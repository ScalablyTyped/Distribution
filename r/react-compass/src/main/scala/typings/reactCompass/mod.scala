package typings.reactCompass

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-compass", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-compass", JSImport.Default)
  @js.native
  class default protected () extends ReactCompass {
    def this(props: ReactCompassProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ReactCompassProps, context: js.Any) = this()
  }
  
  @JSImport("react-compass", "ReactCompass")
  @js.native
  class ReactCompass protected ()
    extends Component[ReactCompassProps, js.Any, js.Any] {
    def this(props: ReactCompassProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ReactCompassProps, context: js.Any) = this()
  }
  
  @scala.inline
  def directionName(dir: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("directionName")(dir.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def normalizeAngle(direction: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAngle")(direction.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait ReactCompassProps extends StObject {
    
    var direction: Double
    
    var directionNames: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ReactCompassProps {
    
    @scala.inline
    def apply(direction: Double): ReactCompassProps = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactCompassProps]
    }
    
    @scala.inline
    implicit class ReactCompassPropsMutableBuilder[Self <: ReactCompassProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionNames(value: js.Array[String]): Self = StObject.set(x, "directionNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionNamesUndefined: Self = StObject.set(x, "directionNames", js.undefined)
      
      @scala.inline
      def setDirectionNamesVarargs(value: String*): Self = StObject.set(x, "directionNames", js.Array(value :_*))
    }
  }
}
