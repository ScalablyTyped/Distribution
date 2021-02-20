package typings.routeRecognizer

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dslMod {
  
  @JSImport("route-recognizer/dist/route-recognizer/dsl", JSImport.Default)
  @js.native
  def default[T /* <: RouteRecognizer */](callback: MatchCallback): Unit = js.native
  @JSImport("route-recognizer/dist/route-recognizer/dsl", JSImport.Default)
  @js.native
  def default[T /* <: RouteRecognizer */](
    callback: MatchCallback,
    addRouteCallback: js.Function2[/* routeRecognizer */ T, /* routes */ js.Array[Route], Unit]
  ): Unit = js.native
  
  @JSImport("route-recognizer/dist/route-recognizer/dsl", "Matcher")
  @js.native
  class Matcher () extends StObject {
    def this(target: String) = this()
    
    def add(path: String, target: String): Unit = js.native
    
    def addChild(path: String, target: String, callback: MatchCallback): Unit = js.native
    def addChild(path: String, target: String, callback: MatchCallback, delegate: Delegate): Unit = js.native
    
    var children: StringDictionary[js.UndefOr[Matcher]] = js.native
    
    var routes: StringDictionary[js.UndefOr[String]] = js.native
    
    var target: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait Delegate extends StObject {
    
    var contextEntered: js.UndefOr[js.Function2[/* context */ String, /* route */ MatchDSL, Unit]] = js.native
    
    var willAddRoute: js.UndefOr[js.Function2[/* context */ js.UndefOr[String], /* route */ String, String]] = js.native
  }
  object Delegate {
    
    @scala.inline
    def apply(): Delegate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Delegate]
    }
    
    @scala.inline
    implicit class DelegateMutableBuilder[Self <: Delegate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContextEntered(value: (/* context */ String, /* route */ MatchDSL) => Unit): Self = StObject.set(x, "contextEntered", js.Any.fromFunction2(value))
      
      @scala.inline
      def setContextEnteredUndefined: Self = StObject.set(x, "contextEntered", js.undefined)
      
      @scala.inline
      def setWillAddRoute(value: (/* context */ js.UndefOr[String], /* route */ String) => String): Self = StObject.set(x, "willAddRoute", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWillAddRouteUndefined: Self = StObject.set(x, "willAddRoute", js.undefined)
    }
  }
  
  @js.native
  trait MatchCallback extends StObject {
    
    def apply(`match`: MatchDSL): Unit = js.native
  }
  
  @js.native
  trait MatchDSL extends StObject {
    
    def apply(path: String): ToDSL = js.native
    def apply(path: String, callback: MatchCallback): Unit = js.native
  }
  
  type Opaque = js.UndefOr[js.Object | Unit | Null]
  
  @js.native
  trait Route extends StObject {
    
    var handler: Opaque = js.native
    
    var path: String = js.native
    
    var queryParams: js.UndefOr[js.Array[String]] = js.native
  }
  object Route {
    
    @scala.inline
    def apply(path: String): Route = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Route]
    }
    
    @scala.inline
    implicit class RouteMutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandler(value: Opaque): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlerNull: Self = StObject.set(x, "handler", null)
      
      @scala.inline
      def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParams(value: js.Array[String]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      @scala.inline
      def setQueryParamsVarargs(value: String*): Self = StObject.set(x, "queryParams", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RouteRecognizer extends StObject {
    
    def add(routes: js.Array[Route]): Unit = js.native
    
    var delegate: js.UndefOr[Delegate] = js.native
  }
  object RouteRecognizer {
    
    @scala.inline
    def apply(add: js.Array[Route] => Unit): RouteRecognizer = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add))
      __obj.asInstanceOf[RouteRecognizer]
    }
    
    @scala.inline
    implicit class RouteRecognizerMutableBuilder[Self <: RouteRecognizer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: js.Array[Route] => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDelegate(value: Delegate): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
    }
  }
  
  @js.native
  trait ToDSL extends StObject {
    
    def to(name: String): Unit = js.native
    def to(name: String, callback: MatchCallback): Unit = js.native
  }
}
