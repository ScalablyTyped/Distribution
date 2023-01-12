package typings.serveIndex

import typings.express.mod.Handler
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** Serves pages that contain directory listings for a given path. */
  inline def apply(path: String): Handler = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[Handler]
  inline def apply(path: String, options: Options): Handler = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Handler]
  
  @JSImport("serve-index", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait File extends StObject {
    
    var name: String
    
    var stat: Stats
  }
  object File {
    
    inline def apply(name: String, stat: Stats): File = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStat(value: Stats): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
    }
  }
  
  trait Locals extends StObject {
    
    var directory: String
    
    var displayIcons: Boolean
    
    var fileList: js.Array[File]
    
    var name: String
    
    var path: String
    
    var stat: Stats
    
    var style: String
    
    var viewName: String
  }
  object Locals {
    
    inline def apply(
      directory: String,
      displayIcons: Boolean,
      fileList: js.Array[File],
      name: String,
      path: String,
      stat: Stats,
      style: String,
      viewName: String
    ): Locals = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], displayIcons = displayIcons.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], viewName = viewName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locals]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Locals] (val x: Self) extends AnyVal {
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setDisplayIcons(value: Boolean): Self = StObject.set(x, "displayIcons", value.asInstanceOf[js.Any])
      
      inline def setFileList(value: js.Array[File]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
      
      inline def setFileListVarargs(value: File*): Self = StObject.set(x, "fileList", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setStat(value: Stats): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setViewName(value: String): Self = StObject.set(x, "viewName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var filter: js.UndefOr[
        js.Function4[
          /* filename */ String, 
          /* index */ Double, 
          /* files */ js.Array[File], 
          /* dir */ String, 
          Boolean
        ]
      ] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var icons: js.UndefOr[Boolean] = js.undefined
    
    var stylesheet: js.UndefOr[String] = js.undefined
    
    var template: js.UndefOr[
        String | (js.Function2[/* locals */ Locals, /* callback */ TemplateCallback, Unit])
      ] = js.undefined
    
    var view: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setFilter(
        value: (/* filename */ String, /* index */ Double, /* files */ js.Array[File], /* dir */ String) => Boolean
      ): Self = StObject.set(x, "filter", js.Any.fromFunction4(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setIcons(value: Boolean): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setStylesheet(value: String): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
      
      inline def setStylesheetUndefined: Self = StObject.set(x, "stylesheet", js.undefined)
      
      inline def setTemplate(value: String | (js.Function2[/* locals */ Locals, /* callback */ TemplateCallback, Unit])): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateFunction2(value: (/* locals */ Locals, /* callback */ TemplateCallback) => Unit): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  type TemplateCallback = js.Function2[/* error */ js.Error | Null, /* htmlString */ js.UndefOr[String], Unit]
}
