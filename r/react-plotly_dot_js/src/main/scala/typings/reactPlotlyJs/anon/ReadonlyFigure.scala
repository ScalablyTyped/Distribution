package typings.reactPlotlyJs.anon

import typings.plotlyJs.mod.Data
import typings.plotlyJs.mod.Frame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-plotly.js.react-plotly.js.Figure> */
trait ReadonlyFigure extends StObject {
  
  val data: js.Array[Data]
  
  val frames: js.UndefOr[js.Array[Frame] | Null] = js.undefined
  
  val layout: PartialLayout
}
object ReadonlyFigure {
  
  @scala.inline
  def apply(data: js.Array[Data], layout: PartialLayout): ReadonlyFigure = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyFigure]
  }
  
  @scala.inline
  implicit class ReadonlyFigureMutableBuilder[Self <: ReadonlyFigure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Data*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setFrames(value: js.Array[Frame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesNull: Self = StObject.set(x, "frames", null)
    
    @scala.inline
    def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    @scala.inline
    def setFramesVarargs(value: Frame*): Self = StObject.set(x, "frames", js.Array(value :_*))
    
    @scala.inline
    def setLayout(value: PartialLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
  }
}
