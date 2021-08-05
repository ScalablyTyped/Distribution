package typings.sharp

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
    
    extension [Self <: `0`](x: Self) {
      
      inline def setResolveWithObject(value: `true`): Self = StObject.set(x, "resolveWithObject", value.asInstanceOf[js.Any])
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
    
    extension [Self <: B](x: Self) {
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  trait Brightness extends StObject {
    
    var brightness: js.UndefOr[Double] = js.undefined
    
    var hue: js.UndefOr[Double] = js.undefined
    
    var saturation: js.UndefOr[Double] = js.undefined
  }
  object Brightness {
    
    inline def apply(): Brightness = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Brightness]
    }
    
    extension [Self <: Brightness](x: Self) {
      
      inline def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
      
      inline def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
      
      inline def setHue(value: Double): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
      
      inline def setHueUndefined: Self = StObject.set(x, "hue", js.undefined)
      
      inline def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
      
      inline def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
    }
  }
  
  trait Buffer extends StObject {
    
    var buffer: Boolean
    
    var file: Boolean
    
    var stream: Boolean
  }
  object Buffer {
    
    inline def apply(buffer: Boolean, file: Boolean, stream: Boolean): Buffer = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Buffer]
    }
    
    extension [Self <: Buffer](x: Self) {
      
      inline def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setFile(value: Boolean): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
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
    
    extension [Self <: Create](x: Self) {
      
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
    
    extension [Self <: Current](x: Self) {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: typings.node.Buffer
    
    var info: OutputInfo
  }
  object Data {
    
    inline def apply(data: typings.node.Buffer, info: OutputInfo): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: typings.node.Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
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
    
    extension [Self <: Max](x: Self) {
      
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
    
    extension [Self <: Raw](x: Self) {
      
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
    
    extension [Self <: ResolveWithObject](x: Self) {
      
      inline def setResolveWithObject(value: `false`): Self = StObject.set(x, "resolveWithObject", value.asInstanceOf[js.Any])
    }
  }
}
