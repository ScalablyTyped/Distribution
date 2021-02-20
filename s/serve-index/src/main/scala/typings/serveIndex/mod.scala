package typings.serveIndex

import typings.express.mod.Handler
import typings.node.fsMod.Stats
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("serve-index", JSImport.Namespace)
  @js.native
  def apply(path: String): Handler = js.native
  @JSImport("serve-index", JSImport.Namespace)
  @js.native
  def apply(path: String, options: Options): Handler = js.native
  
  @js.native
  trait File extends StObject {
    
    var name: String = js.native
    
    var stat: Stats = js.native
  }
  object File {
    
    @scala.inline
    def apply(name: String, stat: Stats): File = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStat(value: Stats): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Locals extends StObject {
    
    var directory: String = js.native
    
    var displayIcons: Boolean = js.native
    
    var fileList: js.Array[File] = js.native
    
    var name: String = js.native
    
    var path: String = js.native
    
    var stat: Stats = js.native
    
    var style: String = js.native
    
    var viewName: String = js.native
  }
  object Locals {
    
    @scala.inline
    def apply(
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
    implicit class LocalsMutableBuilder[Self <: Locals] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayIcons(value: Boolean): Self = StObject.set(x, "displayIcons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileList(value: js.Array[File]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileListVarargs(value: File*): Self = StObject.set(x, "fileList", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStat(value: Stats): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewName(value: String): Self = StObject.set(x, "viewName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var filter: js.UndefOr[
        js.Function4[
          /* filename */ String, 
          /* index */ Double, 
          /* files */ js.Array[File], 
          /* dir */ String, 
          Boolean
        ]
      ] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var icons: js.UndefOr[Boolean] = js.native
    
    var stylesheet: js.UndefOr[String] = js.native
    
    var template: js.UndefOr[
        String | (js.Function2[/* locals */ Locals, /* callback */ templateCallback, Unit])
      ] = js.native
    
    var view: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(
        value: (/* filename */ String, /* index */ Double, /* files */ js.Array[File], /* dir */ String) => Boolean
      ): Self = StObject.set(x, "filter", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setIcons(value: Boolean): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      @scala.inline
      def setStylesheet(value: String): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesheetUndefined: Self = StObject.set(x, "stylesheet", js.undefined)
      
      @scala.inline
      def setTemplate(value: String | (js.Function2[/* locals */ Locals, /* callback */ templateCallback, Unit])): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateFunction2(value: (/* locals */ Locals, /* callback */ templateCallback) => Unit): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  type templateCallback = js.Function2[/* error */ Error, /* htmlString */ js.UndefOr[String], Unit]
}
