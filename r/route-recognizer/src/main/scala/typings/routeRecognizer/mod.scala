package typings.routeRecognizer

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.routeRecognizer.anon.As
import typings.routeRecognizer.dslMod.Delegate
import typings.routeRecognizer.dslMod.MatchCallback
import typings.routeRecognizer.dslMod.Opaque
import typings.routeRecognizer.dslMod.Route
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("route-recognizer", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with RouteRecognizer
  object default {
    
    @JSImport("route-recognizer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("route-recognizer", "default.ENCODE_AND_DECODE_PATH_SEGMENTS")
    @js.native
    def ENCODE_AND_DECODE_PATH_SEGMENTS: Boolean = js.native
    @scala.inline
    def ENCODE_AND_DECODE_PATH_SEGMENTS_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENCODE_AND_DECODE_PATH_SEGMENTS")(x.asInstanceOf[js.Any])
    
    /* static member */
    object Normalizer {
      
      @JSImport("route-recognizer", "default.Normalizer")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def encodePathSegment(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodePathSegment")(str.asInstanceOf[js.Any]).asInstanceOf[String]
      
      @scala.inline
      def normalizePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
      
      @scala.inline
      def normalizeSegment(segment: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSegment")(segment.asInstanceOf[js.Any]).asInstanceOf[String]
    }
    
    /* static member */
    @JSImport("route-recognizer", "default.VERSION")
    @js.native
    def VERSION: String = js.native
    @scala.inline
    def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
  
  trait Params
    extends StObject
       with /* key */ NumberDictionary[Opaque]
       with /* key */ StringDictionary[Opaque] {
    
    var queryParams: js.UndefOr[QueryParams | Null] = js.undefined
  }
  object Params {
    
    @scala.inline
    def apply(): Params = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit class ParamsMutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQueryParams(value: QueryParams): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsNull: Self = StObject.set(x, "queryParams", null)
      
      @scala.inline
      def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
    }
  }
  
  type QueryParams = StringDictionary[js.UndefOr[js.Array[js.Any] | js.Any | Null]]
  
  trait Result extends StObject {
    
    var handler: Opaque
    
    var isDynamic: Boolean
    
    var params: Params
  }
  object Result {
    
    @scala.inline
    def apply(isDynamic: Boolean, params: Params): Result = {
      val __obj = js.Dynamic.literal(isDynamic = isDynamic.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandler(value: Opaque): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlerNull: Self = StObject.set(x, "handler", null)
      
      @scala.inline
      def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      @scala.inline
      def setIsDynamic(value: Boolean): Self = StObject.set(x, "isDynamic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Results
    extends StObject
       with ArrayLike[js.UndefOr[Result]] {
    
    def push(results: Result*): Double = js.native
    
    var queryParams: QueryParams = js.native
    
    def slice(): js.Array[Result] = js.native
    def slice(start: Double): js.Array[Result] = js.native
    def slice(start: Double, end: Double): js.Array[Result] = js.native
    def slice(start: Unit, end: Double): js.Array[Result] = js.native
    
    def splice(start: Double, deleteCount: Double, items: Result*): js.Array[Result] = js.native
  }
  
  @js.native
  trait RouteRecognizer extends StObject {
    
    def add(routes: js.Array[Route]): Unit = js.native
    def add(routes: js.Array[Route], options: As): Unit = js.native
    
    var delegate: js.UndefOr[Delegate] = js.native
    
    def generate(name: String): String = js.native
    def generate(name: String, params: Params): String = js.native
    
    def generateQueryString(params: QueryParams): String = js.native
    
    def handlersFor(name: String): js.Array[js.Any] = js.native
    
    def hasRoute(name: String): Boolean = js.native
    
    def map(context: MatchCallback): Unit = js.native
    def map(
      context: MatchCallback,
      addCallback: js.Function2[/* router */ this.type, /* routes */ js.Array[Route], Unit]
    ): Unit = js.native
    
    var names: js.Any = js.native
    
    def parseQueryString(queryString: String): QueryParams = js.native
    
    def recognize(path: String): js.UndefOr[Results] = js.native
    
    var rootState: js.Any = js.native
    
    var states: js.Any = js.native
  }
}
