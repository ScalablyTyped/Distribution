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
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal(resolveWithObject = true)
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResolveWithObject(value: `true`): Self = StObject.set(x, "resolveWithObject", value.asInstanceOf[js.Any])
    }
  }
  
  trait B extends StObject {
    
    var b: Double
    
    var g: Double
    
    var r: Double
  }
  object B {
    
    @scala.inline
    def apply(b: Double, g: Double, r: Double): B = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[B]
    }
    
    @scala.inline
    implicit class BMutableBuilder[Self <: B] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  trait Brightness extends StObject {
    
    var brightness: js.UndefOr[Double] = js.undefined
    
    var hue: js.UndefOr[Double] = js.undefined
    
    var saturation: js.UndefOr[Double] = js.undefined
  }
  object Brightness {
    
    @scala.inline
    def apply(): Brightness = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Brightness]
    }
    
    @scala.inline
    implicit class BrightnessMutableBuilder[Self <: Brightness] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
      
      @scala.inline
      def setHue(value: Double): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHueUndefined: Self = StObject.set(x, "hue", js.undefined)
      
      @scala.inline
      def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
    }
  }
  
  trait Buffer extends StObject {
    
    var buffer: Boolean
    
    var file: Boolean
    
    var stream: Boolean
  }
  object Buffer {
    
    @scala.inline
    def apply(buffer: Boolean, file: Boolean, stream: Boolean): Buffer = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Buffer]
    }
    
    @scala.inline
    implicit class BufferMutableBuilder[Self <: Buffer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile(value: Boolean): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  trait Create extends StObject {
    
    var create: typings.sharp.mod.Create
  }
  object Create {
    
    @scala.inline
    def apply(create: typings.sharp.mod.Create): Create = {
      val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any])
      __obj.asInstanceOf[Create]
    }
    
    @scala.inline
    implicit class CreateMutableBuilder[Self <: Create] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: typings.sharp.mod.Create): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    }
  }
  
  trait Current extends StObject {
    
    var current: Double
    
    var high: Double
    
    var max: Double
  }
  object Current {
    
    @scala.inline
    def apply(current: Double, high: Double, max: Double): Current = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[Current]
    }
    
    @scala.inline
    implicit class CurrentMutableBuilder[Self <: Current] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: typings.node.Buffer
    
    var info: OutputInfo
  }
  object Data {
    
    @scala.inline
    def apply(data: typings.node.Buffer, info: OutputInfo): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: typings.node.Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfo(value: OutputInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    }
  }
  
  trait Max extends StObject {
    
    var current: Double
    
    var max: Double
  }
  object Max {
    
    @scala.inline
    def apply(current: Double, max: Double): Max = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    @scala.inline
    implicit class MaxMutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    }
  }
  
  trait Raw extends StObject {
    
    var raw: typings.sharp.mod.Raw
  }
  object Raw {
    
    @scala.inline
    def apply(raw: typings.sharp.mod.Raw): Raw = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Raw]
    }
    
    @scala.inline
    implicit class RawMutableBuilder[Self <: Raw] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRaw(value: typings.sharp.mod.Raw): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResolveWithObject extends StObject {
    
    var resolveWithObject: `false`
  }
  object ResolveWithObject {
    
    @scala.inline
    def apply(): ResolveWithObject = {
      val __obj = js.Dynamic.literal(resolveWithObject = false)
      __obj.asInstanceOf[ResolveWithObject]
    }
    
    @scala.inline
    implicit class ResolveWithObjectMutableBuilder[Self <: ResolveWithObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResolveWithObject(value: `false`): Self = StObject.set(x, "resolveWithObject", value.asInstanceOf[js.Any])
    }
  }
}
