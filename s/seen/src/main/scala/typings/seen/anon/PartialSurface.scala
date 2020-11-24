package typings.seen.anon

import typings.seen.mod.Color
import typings.seen.mod.Material
import typings.seen.mod.Painter
import typings.seen.mod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<seen.seen.Surface> */
@js.native
trait PartialSurface extends js.Object {
  
  var constructor: js.UndefOr[
    js.Function2[/* points */ js.Array[Point], /* painter */ js.UndefOr[Painter], js.Any]
  ] = js.native
  
  var cullBackfaces: js.UndefOr[Boolean] = js.native
  
  var dirty: js.UndefOr[Boolean | Null] = js.native
  
  var fill: js.UndefOr[js.Function1[/* fill */ String | Color, this.type]] = js.native
  
  var fillMaterial: js.UndefOr[Material] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var painter: js.UndefOr[Painter] = js.native
  
  var points: js.UndefOr[js.Array[Point]] = js.native
  
  var stroke: js.UndefOr[js.Function1[/* stroke */ String | Color, this.type]] = js.native
  
  var strokeMaterial: js.UndefOr[Material] = js.native
}
object PartialSurface {
  
  @scala.inline
  def apply(): PartialSurface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSurface]
  }
  
  @scala.inline
  implicit class PartialSurfaceOps[Self <: PartialSurface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConstructor(value: (/* points */ js.Array[Point], /* painter */ js.UndefOr[Painter]) => js.Any): Self = this.set("constructor", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteConstructor: Self = this.set("constructor", js.undefined)
    
    @scala.inline
    def setCullBackfaces(value: Boolean): Self = this.set("cullBackfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCullBackfaces: Self = this.set("cullBackfaces", js.undefined)
    
    @scala.inline
    def setDirty(value: Boolean): Self = this.set("dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirty: Self = this.set("dirty", js.undefined)
    
    @scala.inline
    def setDirtyNull: Self = this.set("dirty", null)
    
    @scala.inline
    def setFill(value: /* fill */ String | Color => PartialSurface): Self = this.set("fill", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setFillMaterial(value: Material): Self = this.set("fillMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillMaterial: Self = this.set("fillMaterial", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setPainter(value: Painter): Self = this.set("painter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePainter: Self = this.set("painter", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: Point*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[Point]): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    
    @scala.inline
    def setStroke(value: /* stroke */ String | Color => PartialSurface): Self = this.set("stroke", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setStrokeMaterial(value: Material): Self = this.set("strokeMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeMaterial: Self = this.set("strokeMaterial", js.undefined)
  }
}
