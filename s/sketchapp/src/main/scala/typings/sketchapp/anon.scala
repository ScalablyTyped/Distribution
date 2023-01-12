package typings.sketchapp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait App extends StObject {
    
    var app: String
    
    var appVersion: String
    
    var build: Double
    
    var commit: String
    
    var compatibilityVersion: Double
    
    var variant: String
    
    var version: Double
  }
  object App {
    
    inline def apply(
      app: String,
      appVersion: String,
      build: Double,
      commit: String,
      compatibilityVersion: Double,
      variant: String,
      version: Double
    ): App = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], compatibilityVersion = compatibilityVersion.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[App]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: App] (val x: Self) extends AnyVal {
      
      inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
      
      inline def setBuild(value: Double): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      inline def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      inline def setCompatibilityVersion(value: Double): Self = StObject.set(x, "compatibilityVersion", value.asInstanceOf[js.Any])
      
      inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Archive extends StObject {
    
    var _archive: String
  }
  object Archive {
    
    inline def apply(_archive: String): Archive = {
      val __obj = js.Dynamic.literal(_archive = _archive.asInstanceOf[js.Any])
      __obj.asInstanceOf[Archive]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Archive] (val x: Self) extends AnyVal {
      
      inline def set_archive(value: String): Self = StObject.set(x, "_archive", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var _data: String
  }
  object Data {
    
    inline def apply(_data: String): Data = {
      val __obj = js.Dynamic.literal(_data = _data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def set_data(value: String): Self = StObject.set(x, "_data", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var size: Double
  }
  object Name {
    
    inline def apply(name: String, size: Double): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait PageListCollapsed extends StObject {
    
    var pageListCollapsed: Double
    
    var pageListHeight: Double
  }
  object PageListCollapsed {
    
    inline def apply(pageListCollapsed: Double, pageListHeight: Double): PageListCollapsed = {
      val __obj = js.Dynamic.literal(pageListCollapsed = pageListCollapsed.asInstanceOf[js.Any], pageListHeight = pageListHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageListCollapsed]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageListCollapsed] (val x: Self) extends AnyVal {
      
      inline def setPageListCollapsed(value: Double): Self = StObject.set(x, "pageListCollapsed", value.asInstanceOf[js.Any])
      
      inline def setPageListHeight(value: Double): Self = StObject.set(x, "pageListHeight", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScrollOrigin extends StObject {
    
    var scrollOrigin: SketchMSCurvePoint
    
    var zoomValue: Double
  }
  object ScrollOrigin {
    
    inline def apply(scrollOrigin: SketchMSCurvePoint, zoomValue: Double): ScrollOrigin = {
      val __obj = js.Dynamic.literal(scrollOrigin = scrollOrigin.asInstanceOf[js.Any], zoomValue = zoomValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollOrigin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollOrigin] (val x: Self) extends AnyVal {
      
      inline def setScrollOrigin(value: SketchMSCurvePoint): Self = StObject.set(x, "scrollOrigin", value.asInstanceOf[js.Any])
      
      inline def setZoomValue(value: Double): Self = StObject.set(x, "zoomValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
