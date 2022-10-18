package typings.recoil

import typings.recoil.mod.EvictionPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recoilStrings {
  
  @js.native
  sealed trait DefaultValue extends StObject
  inline def DefaultValue: DefaultValue = "DefaultValue".asInstanceOf[DefaultValue]
  
  @js.native
  sealed trait atom extends StObject
  inline def atom: atom = "atom".asInstanceOf[atom]
  
  @js.native
  sealed trait get extends StObject
  inline def get: get = "get".asInstanceOf[get]
  
  @js.native
  sealed trait hasError extends StObject
  inline def hasError: hasError = "hasError".asInstanceOf[hasError]
  
  @js.native
  sealed trait hasValue extends StObject
  inline def hasValue: hasValue = "hasValue".asInstanceOf[hasValue]
  
  @js.native
  sealed trait `keep-all`
    extends StObject
       with EvictionPolicy
  inline def `keep-all`: `keep-all` = "keep-all".asInstanceOf[`keep-all`]
  
  @js.native
  sealed trait loading extends StObject
  inline def loading: loading = "loading".asInstanceOf[loading]
  
  @js.native
  sealed trait lru
    extends StObject
       with EvictionPolicy
  inline def lru: lru = "lru".asInstanceOf[lru]
  
  @js.native
  sealed trait `most-recent`
    extends StObject
       with EvictionPolicy
  inline def `most-recent`: `most-recent` = "most-recent".asInstanceOf[`most-recent`]
  
  @js.native
  sealed trait selector extends StObject
  inline def selector: selector = "selector".asInstanceOf[selector]
  
  @js.native
  sealed trait set extends StObject
  inline def set: set = "set".asInstanceOf[set]
}
