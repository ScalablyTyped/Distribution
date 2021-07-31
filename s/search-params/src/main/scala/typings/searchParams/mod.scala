package typings.searchParams

import typings.searchParams.encodeMod.IOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("search-params", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def build[T /* <: Record[String, js.Any] */](params: T): String = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(params.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def build[T /* <: Record[String, js.Any] */](params: T, opts: IOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(params.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def keep(path: String, paramsToKeep: js.Array[String]): IKeepResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("keep")(path.asInstanceOf[js.Any], paramsToKeep.asInstanceOf[js.Any])).asInstanceOf[IKeepResponse]
  @scala.inline
  def keep(path: String, paramsToKeep: js.Array[String], opts: IOptions): IKeepResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("keep")(path.asInstanceOf[js.Any], paramsToKeep.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IKeepResponse]
  
  @scala.inline
  def omit(path: String, paramsToOmit: js.Array[String]): IOmitResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(path.asInstanceOf[js.Any], paramsToOmit.asInstanceOf[js.Any])).asInstanceOf[IOmitResponse]
  @scala.inline
  def omit(path: String, paramsToOmit: js.Array[String], opts: IOptions): IOmitResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(path.asInstanceOf[js.Any], paramsToOmit.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IOmitResponse]
  
  @scala.inline
  def parse[T /* <: Record[String, js.Any] */](path: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(path.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def parse[T /* <: Record[String, js.Any] */](path: String, opts: IOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T]
  
  trait IKeepResponse extends StObject {
    
    var keptParams: js.Object
    
    var querystring: String
  }
  object IKeepResponse {
    
    @scala.inline
    def apply(keptParams: js.Object, querystring: String): IKeepResponse = {
      val __obj = js.Dynamic.literal(keptParams = keptParams.asInstanceOf[js.Any], querystring = querystring.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeepResponse]
    }
    
    @scala.inline
    implicit class IKeepResponseMutableBuilder[Self <: IKeepResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeptParams(value: js.Object): Self = StObject.set(x, "keptParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuerystring(value: String): Self = StObject.set(x, "querystring", value.asInstanceOf[js.Any])
    }
  }
  
  trait IOmitResponse extends StObject {
    
    var querystring: String
    
    var removedParams: js.Object
  }
  object IOmitResponse {
    
    @scala.inline
    def apply(querystring: String, removedParams: js.Object): IOmitResponse = {
      val __obj = js.Dynamic.literal(querystring = querystring.asInstanceOf[js.Any], removedParams = removedParams.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOmitResponse]
    }
    
    @scala.inline
    implicit class IOmitResponseMutableBuilder[Self <: IOmitResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuerystring(value: String): Self = StObject.set(x, "querystring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovedParams(value: js.Object): Self = StObject.set(x, "removedParams", value.asInstanceOf[js.Any])
    }
  }
  
  type SearchParams = Record[String, js.UndefOr[String | Boolean | Null | (js.Array[String | Boolean | Null])]]
}
