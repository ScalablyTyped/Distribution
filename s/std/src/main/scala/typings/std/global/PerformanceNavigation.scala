package typings.std.global

import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`255`
import typings.std.stdInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("PerformanceNavigation")
@js.native
/* standard dom */
open class PerformanceNavigation ()
  extends StObject
     with typings.std.PerformanceNavigation {
  
  /* standard dom */
  /* CompleteClass */
  override val TYPE_BACK_FORWARD: `2` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val TYPE_NAVIGATE: `0` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val TYPE_RELOAD: `1` = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val TYPE_RESERVED: `255` = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigation/redirectCount)
    */
  /* standard dom */
  /* CompleteClass */
  override val redirectCount: Double = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigation/toJSON)
    */
  /* standard dom */
  /* CompleteClass */
  override def toJSON(): Any = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigation/type)
    */
  /* standard dom */
  /* CompleteClass */
  override val `type`: Double = js.native
}
/** @deprecated */
object PerformanceNavigation {
  
  /* standard dom */
  @JSGlobal("PerformanceNavigation.TYPE_BACK_FORWARD")
  @js.native
  val TYPE_BACK_FORWARD: `2` = js.native
  
  /* standard dom */
  @JSGlobal("PerformanceNavigation.TYPE_NAVIGATE")
  @js.native
  val TYPE_NAVIGATE: `0` = js.native
  
  /* standard dom */
  @JSGlobal("PerformanceNavigation.TYPE_RELOAD")
  @js.native
  val TYPE_RELOAD: `1` = js.native
  
  /* standard dom */
  @JSGlobal("PerformanceNavigation.TYPE_RESERVED")
  @js.native
  val TYPE_RESERVED: `255` = js.native
}
