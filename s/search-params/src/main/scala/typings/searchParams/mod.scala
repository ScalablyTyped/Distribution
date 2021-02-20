package typings.searchParams

import typings.searchParams.encodeMod.IOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("search-params", "build")
  @js.native
  def build[T /* <: Record[String, _] */](params: T): String = js.native
  @JSImport("search-params", "build")
  @js.native
  def build[T /* <: Record[String, _] */](params: T, opts: IOptions): String = js.native
  
  @JSImport("search-params", "keep")
  @js.native
  def keep(path: String, paramsToKeep: js.Array[String]): IKeepResponse = js.native
  @JSImport("search-params", "keep")
  @js.native
  def keep(path: String, paramsToKeep: js.Array[String], opts: IOptions): IKeepResponse = js.native
  
  @JSImport("search-params", "omit")
  @js.native
  def omit(path: String, paramsToOmit: js.Array[String]): IOmitResponse = js.native
  @JSImport("search-params", "omit")
  @js.native
  def omit(path: String, paramsToOmit: js.Array[String], opts: IOptions): IOmitResponse = js.native
  
  @JSImport("search-params", "parse")
  @js.native
  def parse[T /* <: Record[String, _] */](path: String): T = js.native
  @JSImport("search-params", "parse")
  @js.native
  def parse[T /* <: Record[String, _] */](path: String, opts: IOptions): T = js.native
  
  @js.native
  trait IKeepResponse extends StObject {
    
    var keptParams: js.Object = js.native
    
    var querystring: String = js.native
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
  
  @js.native
  trait IOmitResponse extends StObject {
    
    var querystring: String = js.native
    
    var removedParams: js.Object = js.native
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
