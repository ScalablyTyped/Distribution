package typings.snapchatLensStudio

import typings.snapchatLensStudio.snapchatLensStudioInts.`0`
import typings.snapchatLensStudio.snapchatLensStudioInts.`10`
import typings.snapchatLensStudio.snapchatLensStudioInts.`11`
import typings.snapchatLensStudio.snapchatLensStudioInts.`12`
import typings.snapchatLensStudio.snapchatLensStudioInts.`1`
import typings.snapchatLensStudio.snapchatLensStudioInts.`2`
import typings.snapchatLensStudio.snapchatLensStudioInts.`3`
import typings.snapchatLensStudio.snapchatLensStudioInts.`4`
import typings.snapchatLensStudio.snapchatLensStudioInts.`5`
import typings.snapchatLensStudio.snapchatLensStudioInts.`6`
import typings.snapchatLensStudio.snapchatLensStudioInts.`7`
import typings.snapchatLensStudio.snapchatLensStudioInts.`8`
import typings.snapchatLensStudio.snapchatLensStudioInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Controls how a mesh will get rendered. Each Pass acts as an interface for the shader
  * it’s associated with. Any properties on a Pass’s shader will automatically become
  * properties on that Pass. For example, if the shader defines a variable named baseColor,
  * a script would be able to access that property as Pass.baseColor.
  *
  * @see https://lensstudio.snapchat.com/api/classes/Pass/
  *
  * If you need to rely on any of the Shader Properties documented below, then use a block like the following in your script to augment the Pass interface:
  * @see https://lensstudio.snapchat.com/api/ShaderProperties/
  * ```
  * declare global {
  *     interface Pass {
  *         // Specifies the base color (albedo) of the material if the ‘Base Texture’ is disabled. Multiplied with the ‘Base Texture’ otherwise.
  *         baseColor: vec4
  *         // Most materials use a base texture (albedo), but disabling it means the base texture will be considered white, and ‘Base Color’ will solely control the color.
  *         baseTex: Asset.Texture
  *         // Normally, the Base Texture’s alpha is taken as opacity. Enabling this allows you to define a separate greyscale opacity texture. The ‘Opacity Texture’ value will be multiplied with the
  *         // Base Texture’s alpha (which is 1 for textures without alpha) to get the final opacity. ‘Opacity Texture’ is only available if ‘Blend Mode’ is not ‘Disabled’.
  *         opacityTex: Asset.Texture
  *     }
  * }
  * ```
  */
trait Pass
  extends StObject
     with ScriptObject {
  
  /**
    * The blend mode used for rendering. Possible values:
    *
    * BlendMode - Value - Expression
    *
    * Normal - 0 - SrcAlpha, OneMinusSrcAlpha
    *
    * MultiplyLegacy [DEPRECATED] - 1 - DstColor, OneMinusSrcAlpha
    *
    * AddLegacy [DEPRECATED] - 2 - One, One
    *
    * Screen - 3 - One, OneMinusSrcColor
    *
    * PremultipliedAlpha - 4 - One, OneMinusSrcAlpha
    *
    * AlphaToCoverage - 5 - Blend Disabled
    *
    * Disabled - 6 - Blend Disabled
    *
    * Add - 7 - SrcAlpha, One
    *
    * AlphaTest - 8 - Blend Disabled
    *
    * ColoredGlass - 9 - Blend Disabled
    *
    * Multiply - 10 - DstColor, Zero
    *
    * Min - 11 - One, One
    *
    * Max - 12 - One, One
    *
    * ```
    * // Sets the blend mode of the main pass for a material to Screen
    * //@input Asset.Material material
    * script.material.mainPass.blendMode = 3;
    * ```
    */
  var blendMode: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12`
  
  /** Controls the masking of color channels with a vec4b representing each channel with a boolean. */
  var colorMask: vec4b
  
  /** The cull mode used for rendering. */
  var cullMode: CullMode
  
  /** Enables depth-sorting. */
  var depthTest: Boolean
  
  /** Enables writing pixels to the depth buffer. */
  var depthWrite: Boolean
  
  /** Number of times the pass will be rendered. Useful with the Instance ID node in Material Editor. */
  var instanceCount: Double
  
  /** Line width used for rendering. */
  var lineWidth: Double
  
  /** The name of the Pass. */
  var name: String
  
  /** Changes the position that each polygon gets drawn. */
  var polygonOffset: vec2
  
  /** Whether the material renders on both sides of a mesh face. */
  var twoSided: Boolean
}
object Pass {
  
  inline def apply(
    blendMode: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12`,
    colorMask: vec4b,
    cullMode: CullMode,
    depthTest: Boolean,
    depthWrite: Boolean,
    getTypeName: () => String,
    instanceCount: Double,
    isOfType: String => Boolean,
    lineWidth: Double,
    name: String,
    polygonOffset: vec2,
    twoSided: Boolean
  ): Pass = {
    val __obj = js.Dynamic.literal(blendMode = blendMode.asInstanceOf[js.Any], colorMask = colorMask.asInstanceOf[js.Any], cullMode = cullMode.asInstanceOf[js.Any], depthTest = depthTest.asInstanceOf[js.Any], depthWrite = depthWrite.asInstanceOf[js.Any], getTypeName = js.Any.fromFunction0(getTypeName), instanceCount = instanceCount.asInstanceOf[js.Any], isOfType = js.Any.fromFunction1(isOfType), lineWidth = lineWidth.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], polygonOffset = polygonOffset.asInstanceOf[js.Any], twoSided = twoSided.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pass]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pass] (val x: Self) extends AnyVal {
    
    inline def setBlendMode(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12`): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    inline def setColorMask(value: vec4b): Self = StObject.set(x, "colorMask", value.asInstanceOf[js.Any])
    
    inline def setCullMode(value: CullMode): Self = StObject.set(x, "cullMode", value.asInstanceOf[js.Any])
    
    inline def setDepthTest(value: Boolean): Self = StObject.set(x, "depthTest", value.asInstanceOf[js.Any])
    
    inline def setDepthWrite(value: Boolean): Self = StObject.set(x, "depthWrite", value.asInstanceOf[js.Any])
    
    inline def setInstanceCount(value: Double): Self = StObject.set(x, "instanceCount", value.asInstanceOf[js.Any])
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPolygonOffset(value: vec2): Self = StObject.set(x, "polygonOffset", value.asInstanceOf[js.Any])
    
    inline def setTwoSided(value: Boolean): Self = StObject.set(x, "twoSided", value.asInstanceOf[js.Any])
  }
}
