package typings.slimerjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Architecture extends StObject {
    
    var architecture: String
    
    var name: String
    
    var version: String
  }
  object Architecture {
    
    @scala.inline
    def apply(architecture: String, name: String, version: String): Architecture = {
      val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Architecture]
    }
    
    @scala.inline
    implicit class ArchitectureMutableBuilder[Self <: Architecture] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Charset extends StObject {
    
    var charset: js.UndefOr[String] = js.undefined
    
    var mode: String
  }
  object Charset {
    
    @scala.inline
    def apply(mode: String): Charset = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Charset]
    }
    
    @scala.inline
    implicit class CharsetMutableBuilder[Self <: Charset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Format extends StObject {
    
    var format: js.UndefOr[String] = js.undefined
    
    var onlyViewport: js.UndefOr[Boolean] = js.undefined
    
    var quality: js.UndefOr[String] = js.undefined
    
    var ratio: js.UndefOr[Double] = js.undefined
  }
  object Format {
    
    @scala.inline
    def apply(): Format = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Format]
    }
    
    @scala.inline
    implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setOnlyViewport(value: Boolean): Self = StObject.set(x, "onlyViewport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyViewportUndefined: Self = StObject.set(x, "onlyViewport", js.undefined)
      
      @scala.inline
      def setQuality(value: String): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    }
  }
  
  trait Major extends StObject {
    
    var major: Double
    
    var minor: Double
    
    var patch: Double
  }
  object Major {
    
    @scala.inline
    def apply(major: Double, minor: Double, patch: Double): Major = {
      val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
      __obj.asInstanceOf[Major]
    }
    
    @scala.inline
    implicit class MajorMutableBuilder[Self <: Major] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatch(value: Double): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    }
  }
}
