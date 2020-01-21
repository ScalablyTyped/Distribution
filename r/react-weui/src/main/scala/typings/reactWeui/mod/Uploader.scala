package typings.reactWeui.mod

import typings.reactWeui.AnonFiles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-weui", "Uploader")
@js.native
class Uploader protected () extends js.Object {
  def this(args: js.Any*) = this()
  def detectVerticalSquash(img: js.Any): js.Any = js.native
  def handleChange(e: js.Any): Unit = js.native
  def handleFile(file: js.Any, cb: js.Any, args: js.Any*): Unit = js.native
  def render(): js.Any = js.native
  def renderFiles(): js.Any = js.native
}

/* static members */
@JSImport("react-weui", "Uploader")
@js.native
object Uploader extends js.Object {
  var defaultProps: AnonFiles = js.native
  @js.native
  object propTypes extends js.Object {
    @js.native
    object files extends js.Object {
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
    
    @js.native
    object lang extends js.Object {
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
    
    @js.native
    object maxCount extends js.Object {
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
    
    @js.native
    object maxWidth extends js.Object {
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
    
    @js.native
    object onChange extends js.Object {
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
    
    @js.native
    object onError extends js.Object {
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
    
    @js.native
    object title extends js.Object {
      def apply(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
      def isRequired(p0: js.Any, p1: js.Any, p2: js.Any, p3: js.Any, p4: js.Any, p5: js.Any): js.Any = js.native
    }
    
  }
  
}

