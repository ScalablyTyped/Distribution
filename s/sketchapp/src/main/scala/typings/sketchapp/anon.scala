package typings.sketchapp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait App extends StObject {
    
    var app: String = js.native
    
    var appVersion: String = js.native
    
    var build: Double = js.native
    
    var commit: String = js.native
    
    var compatibilityVersion: Double = js.native
    
    var variant: String = js.native
    
    var version: Double = js.native
  }
  object App {
    
    @scala.inline
    def apply(
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
    implicit class AppMutableBuilder[Self <: App] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuild(value: Double): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompatibilityVersion(value: Double): Self = StObject.set(x, "compatibilityVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Archive extends StObject {
    
    var _archive: String = js.native
  }
  object Archive {
    
    @scala.inline
    def apply(_archive: String): Archive = {
      val __obj = js.Dynamic.literal(_archive = _archive.asInstanceOf[js.Any])
      __obj.asInstanceOf[Archive]
    }
    
    @scala.inline
    implicit class ArchiveMutableBuilder[Self <: Archive] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_archive(value: String): Self = StObject.set(x, "_archive", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Data extends StObject {
    
    var _data: String = js.native
  }
  object Data {
    
    @scala.inline
    def apply(_data: String): Data = {
      val __obj = js.Dynamic.literal(_data = _data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_data(value: String): Self = StObject.set(x, "_data", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: String = js.native
    
    var size: Double = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String, size: Double): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PageListCollapsed extends StObject {
    
    var pageListCollapsed: Double = js.native
    
    var pageListHeight: Double = js.native
  }
  object PageListCollapsed {
    
    @scala.inline
    def apply(pageListCollapsed: Double, pageListHeight: Double): PageListCollapsed = {
      val __obj = js.Dynamic.literal(pageListCollapsed = pageListCollapsed.asInstanceOf[js.Any], pageListHeight = pageListHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageListCollapsed]
    }
    
    @scala.inline
    implicit class PageListCollapsedMutableBuilder[Self <: PageListCollapsed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPageListCollapsed(value: Double): Self = StObject.set(x, "pageListCollapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageListHeight(value: Double): Self = StObject.set(x, "pageListHeight", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScrollOrigin extends StObject {
    
    var scrollOrigin: SketchMSCurvePoint = js.native
    
    var zoomValue: Double = js.native
  }
  object ScrollOrigin {
    
    @scala.inline
    def apply(scrollOrigin: SketchMSCurvePoint, zoomValue: Double): ScrollOrigin = {
      val __obj = js.Dynamic.literal(scrollOrigin = scrollOrigin.asInstanceOf[js.Any], zoomValue = zoomValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollOrigin]
    }
    
    @scala.inline
    implicit class ScrollOriginMutableBuilder[Self <: ScrollOrigin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScrollOrigin(value: SketchMSCurvePoint): Self = StObject.set(x, "scrollOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomValue(value: Double): Self = StObject.set(x, "zoomValue", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait X extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
