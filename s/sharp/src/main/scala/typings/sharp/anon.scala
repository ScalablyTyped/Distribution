package typings.sharp

import typings.sharp.mod.CreateText
import typings.sharp.mod.OutputInfo
import typings.sharp.sharpBooleans.`false`
import typings.sharp.sharpBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var resolveWithObject: `true`
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(resolveWithObject = true)
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setResolveWithObject(value: `true`): Self = StObject.set(x, "resolveWithObject", value.asInstanceOf[js.Any])
    }
  }
  
  trait Alias extends StObject {
    
    var alias: js.UndefOr[js.Array[String]] = js.undefined
    
    var buffer: Boolean
    
    var file: Boolean
    
    var stream: Boolean
  }
  object Alias {
    
    inline def apply(buffer: Boolean, file: Boolean, stream: Boolean): Alias = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alias]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Alias] (val x: Self) extends AnyVal {
      
      inline def setAlias(value: js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value*))
      
      inline def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setFile(value: Boolean): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  trait B extends StObject {
    
    var b: Double
    
    var g: Double
    
    var r: Double
  }
  object B {
    
    inline def apply(b: Double, g: Double, r: Double): B = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[B]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: B] (val x: Self) extends AnyVal {
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  trait Brightness extends StObject {
    
    var brightness: js.UndefOr[Double] = js.undefined
    
    var hue: js.UndefOr[Double] = js.undefined
    
    var lightness: js.UndefOr[Double] = js.undefined
    
    var saturation: js.UndefOr[Double] = js.undefined
  }
  object Brightness {
    
    inline def apply(): Brightness = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Brightness]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Brightness] (val x: Self) extends AnyVal {
      
      inline def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
      
      inline def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
      
      inline def setHue(value: Double): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
      
      inline def setHueUndefined: Self = StObject.set(x, "hue", js.undefined)
      
      inline def setLightness(value: Double): Self = StObject.set(x, "lightness", value.asInstanceOf[js.Any])
      
      inline def setLightnessUndefined: Self = StObject.set(x, "lightness", js.undefined)
      
      inline def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
      
      inline def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
    }
  }
  
  trait Buffer extends StObject {
    
    var buffer: Boolean
    
    var file: Boolean
    
    var fileSuffix: js.UndefOr[js.Array[String]] = js.undefined
    
    var stream: Boolean
  }
  object Buffer {
    
    inline def apply(buffer: Boolean, file: Boolean, stream: Boolean): Buffer = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Buffer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Buffer] (val x: Self) extends AnyVal {
      
      inline def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setFile(value: Boolean): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileSuffix(value: js.Array[String]): Self = StObject.set(x, "fileSuffix", value.asInstanceOf[js.Any])
      
      inline def setFileSuffixUndefined: Self = StObject.set(x, "fileSuffix", js.undefined)
      
      inline def setFileSuffixVarargs(value: String*): Self = StObject.set(x, "fileSuffix", js.Array(value*))
      
      inline def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  trait Create extends StObject {
    
    var create: typings.sharp.mod.Create
  }
  object Create {
    
    inline def apply(create: typings.sharp.mod.Create): Create = {
      val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any])
      __obj.asInstanceOf[Create]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Create] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: typings.sharp.mod.Create): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    }
  }
  
  trait Current extends StObject {
    
    var current: Double
    
    var high: Double
    
    var max: Double
  }
  object Current {
    
    inline def apply(current: Double, high: Double, max: Double): Current = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[Current]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Current] (val x: Self) extends AnyVal {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: typings.node.bufferMod.global.Buffer
    
    var info: OutputInfo
  }
  object Data {
    
    inline def apply(data: typings.node.bufferMod.global.Buffer, info: OutputInfo): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setData(value: typings.node.bufferMod.global.Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: OutputInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    }
  }
  
  trait Max extends StObject {
    
    var current: Double
    
    var max: Double
  }
  object Max {
    
    inline def apply(current: Double, max: Double): Max = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    }
  }
  
  trait Raw extends StObject {
    
    var raw: typings.sharp.mod.Raw
  }
  object Raw {
    
    inline def apply(raw: typings.sharp.mod.Raw): Raw = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Raw]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Raw] (val x: Self) extends AnyVal {
      
      inline def setRaw(value: typings.sharp.mod.Raw): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResolveWithObject extends StObject {
    
    var resolveWithObject: `false`
  }
  object ResolveWithObject {
    
    inline def apply(): ResolveWithObject = {
      val __obj = js.Dynamic.literal(resolveWithObject = false)
      __obj.asInstanceOf[ResolveWithObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolveWithObject] (val x: Self) extends AnyVal {
      
      inline def setResolveWithObject(value: `false`): Self = StObject.set(x, "resolveWithObject", value.asInstanceOf[js.Any])
    }
  }
  
  trait Text extends StObject {
    
    var text: CreateText
  }
  object Text {
    
    inline def apply(text: CreateText): Text = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      inline def setText(value: CreateText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
