package typings.snapchatLensStudio

import typings.snapchatLensStudio.Asset.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Fill settings used by several text related classes. Used in Text’s textFill property, DropshadowSettings’ fill property, and OutlineSettings’ fill property. */
trait TextFill
  extends StObject
     with ScriptObject {
  
  /** If mode is set to TextFillMode.Solid, this will be used as the solid color used in drawing. */
  var color: vec4
  
  /** Controls which drawing method is used. Can switch between Texture mode (for drawing using a tiled texture) or Solid mode (for drawing a solid color). */
  var mode: TextFillMode
  
  /** If mode is set to TextFillMode.Texture, this will be used as the texture asset used in drawing. */
  var texture: Texture
  
  /** If mode is set to TextFillMode.Texture, this defines what type of stretching is used when the Texture’s aspect ratio doesn’t match the drawing area’s aspect ratio. */
  var textureStretch: StretchMode
  
  /** If mode is set to TextFillMode.Texture, this defines how many times the texture will tile across its drawing zone. */
  var tileCount: Double
  
  /** If mode is set to TextFillMode.Texture, this defines what area should be used for tiling the texture. */
  var tileZone: TileZone
}
object TextFill {
  
  inline def apply(
    color: vec4,
    getTypeName: () => String,
    isOfType: String => Boolean,
    mode: TextFillMode,
    texture: Texture,
    textureStretch: StretchMode,
    tileCount: Double,
    tileZone: TileZone
  ): TextFill = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), mode = mode.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], textureStretch = textureStretch.asInstanceOf[js.Any], tileCount = tileCount.asInstanceOf[js.Any], tileZone = tileZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFill]
  }
  
  extension [Self <: TextFill](x: Self) {
    
    inline def setColor(value: vec4): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setMode(value: TextFillMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setTexture(value: Texture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    inline def setTextureStretch(value: StretchMode): Self = StObject.set(x, "textureStretch", value.asInstanceOf[js.Any])
    
    inline def setTileCount(value: Double): Self = StObject.set(x, "tileCount", value.asInstanceOf[js.Any])
    
    inline def setTileZone(value: TileZone): Self = StObject.set(x, "tileZone", value.asInstanceOf[js.Any])
  }
}
