package typings.reactFrontload

import org.scalablytyped.runtime.StringDictionary
import typings.reactFrontload.mod.FrontloadData
import typings.reactFrontload.mod.FrontloadServerRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AllFrontloads extends StObject {
    
    var allFrontloads: js.Array[FrontloadData]
    
    var cachedFrontloads: StringDictionary[Boolean]
    
    var duplicateFrontloads: StringDictionary[Double]
    
    var errorCachedFrontloads: StringDictionary[Boolean]
    
    var errors: StringDictionary[Any]
    
    var newFrontloads: js.Array[FrontloadData]
    
    var pass: Double
  }
  object AllFrontloads {
    
    inline def apply(
      allFrontloads: js.Array[FrontloadData],
      cachedFrontloads: StringDictionary[Boolean],
      duplicateFrontloads: StringDictionary[Double],
      errorCachedFrontloads: StringDictionary[Boolean],
      errors: StringDictionary[Any],
      newFrontloads: js.Array[FrontloadData],
      pass: Double
    ): AllFrontloads = {
      val __obj = js.Dynamic.literal(allFrontloads = allFrontloads.asInstanceOf[js.Any], cachedFrontloads = cachedFrontloads.asInstanceOf[js.Any], duplicateFrontloads = duplicateFrontloads.asInstanceOf[js.Any], errorCachedFrontloads = errorCachedFrontloads.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], newFrontloads = newFrontloads.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllFrontloads]
    }
    
    extension [Self <: AllFrontloads](x: Self) {
      
      inline def setAllFrontloads(value: js.Array[FrontloadData]): Self = StObject.set(x, "allFrontloads", value.asInstanceOf[js.Any])
      
      inline def setAllFrontloadsVarargs(value: FrontloadData*): Self = StObject.set(x, "allFrontloads", js.Array(value*))
      
      inline def setCachedFrontloads(value: StringDictionary[Boolean]): Self = StObject.set(x, "cachedFrontloads", value.asInstanceOf[js.Any])
      
      inline def setDuplicateFrontloads(value: StringDictionary[Double]): Self = StObject.set(x, "duplicateFrontloads", value.asInstanceOf[js.Any])
      
      inline def setErrorCachedFrontloads(value: StringDictionary[Boolean]): Self = StObject.set(x, "errorCachedFrontloads", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: StringDictionary[Any]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setNewFrontloads(value: js.Array[FrontloadData]): Self = StObject.set(x, "newFrontloads", value.asInstanceOf[js.Any])
      
      inline def setNewFrontloadsVarargs(value: FrontloadData*): Self = StObject.set(x, "newFrontloads", js.Array(value*))
      
      inline def setPass(value: Double): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    }
  }
  
  trait Children extends StObject {
    
    var children: Any
    
    var initialState: typings.reactFrontload.mod.FrontloadState
  }
  object Children {
    
    inline def apply(children: Any, initialState: typings.reactFrontload.mod.FrontloadState): Children = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], initialState = initialState.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setInitialState(value: typings.reactFrontload.mod.FrontloadState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    }
  }
  
  trait Context extends StObject {
    
    var context: Any
    
    var logging: js.UndefOr[Boolean] = js.undefined
  }
  object Context {
    
    inline def apply(context: Any): Context = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    }
  }
  
  trait Data[T] extends StObject {
    
    var data: StringDictionary[Any]
    
    var rendered: T
  }
  object Data {
    
    inline def apply[T](data: StringDictionary[Any], rendered: T): Data[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data[T]]
    }
    
    extension [Self <: Data[?], T](x: Self & Data[T]) {
      
      inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setRendered(value: T): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
    }
  }
  
  trait FrontloadState[T] extends StObject {
    
    var frontloadState: typings.reactFrontload.mod.FrontloadState
    
    var render: FrontloadServerRenderFunction[T]
  }
  object FrontloadState {
    
    inline def apply[T](frontloadState: typings.reactFrontload.mod.FrontloadState, render: /* args */ IsFinalRender => T): FrontloadState[T] = {
      val __obj = js.Dynamic.literal(frontloadState = frontloadState.asInstanceOf[js.Any], render = js.Any.fromFunction1(render))
      __obj.asInstanceOf[FrontloadState[T]]
    }
    
    extension [Self <: FrontloadState[?], T](x: Self & FrontloadState[T]) {
      
      inline def setFrontloadState(value: typings.reactFrontload.mod.FrontloadState): Self = StObject.set(x, "frontloadState", value.asInstanceOf[js.Any])
      
      inline def setRender(value: /* args */ IsFinalRender => T): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    }
  }
  
  trait Frontloads extends StObject {
    
    var frontloads: js.Array[String]
    
    var numPasses: Double
  }
  object Frontloads {
    
    inline def apply(frontloads: js.Array[String], numPasses: Double): Frontloads = {
      val __obj = js.Dynamic.literal(frontloads = frontloads.asInstanceOf[js.Any], numPasses = numPasses.asInstanceOf[js.Any])
      __obj.asInstanceOf[Frontloads]
    }
    
    extension [Self <: Frontloads](x: Self) {
      
      inline def setFrontloads(value: js.Array[String]): Self = StObject.set(x, "frontloads", value.asInstanceOf[js.Any])
      
      inline def setFrontloadsVarargs(value: String*): Self = StObject.set(x, "frontloads", js.Array(value*))
      
      inline def setNumPasses(value: Double): Self = StObject.set(x, "numPasses", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsFinalRender extends StObject {
    
    var isFinalRender: js.UndefOr[Boolean] = js.undefined
  }
  object IsFinalRender {
    
    inline def apply(): IsFinalRender = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsFinalRender]
    }
    
    extension [Self <: IsFinalRender](x: Self) {
      
      inline def setIsFinalRender(value: Boolean): Self = StObject.set(x, "isFinalRender", value.asInstanceOf[js.Any])
      
      inline def setIsFinalRenderUndefined: Self = StObject.set(x, "isFinalRender", js.undefined)
    }
  }
  
  trait Logging extends StObject {
    
    var context: Any
    
    var logging: js.UndefOr[Boolean] = js.undefined
    
    var serverRenderedData: Any
  }
  object Logging {
    
    inline def apply(context: Any, serverRenderedData: Any): Logging = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], serverRenderedData = serverRenderedData.asInstanceOf[js.Any])
      __obj.asInstanceOf[Logging]
    }
    
    extension [Self <: Logging](x: Self) {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      inline def setServerRenderedData(value: Any): Self = StObject.set(x, "serverRenderedData", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServerRenderedData extends StObject {
    
    var context: Any
    
    var logging: js.UndefOr[Boolean] = js.undefined
    
    var serverRenderedData: js.UndefOr[js.Object] = js.undefined
  }
  object ServerRenderedData {
    
    inline def apply(context: Any): ServerRenderedData = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerRenderedData]
    }
    
    extension [Self <: ServerRenderedData](x: Self) {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      inline def setServerRenderedData(value: js.Object): Self = StObject.set(x, "serverRenderedData", value.asInstanceOf[js.Any])
      
      inline def setServerRenderedDataUndefined: Self = StObject.set(x, "serverRenderedData", js.undefined)
    }
  }
}
