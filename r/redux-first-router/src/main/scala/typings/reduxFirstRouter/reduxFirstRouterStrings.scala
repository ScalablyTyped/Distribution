package typings.reduxFirstRouter

import typings.reduxFirstRouter.mod.LocationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduxFirstRouterStrings {
  
  @js.native
  sealed trait `@@redux-first-routerSlashNOT_FOUND` extends StObject
  inline def `@@redux-first-routerSlashNOT_FOUND`: `@@redux-first-routerSlashNOT_FOUND` = "@@redux-first-router/NOT_FOUND".asInstanceOf[`@@redux-first-routerSlashNOT_FOUND`]
  
  @js.native
  sealed trait back
    extends StObject
       with LocationKind
  inline def back: back = "back".asInstanceOf[back]
  
  @js.native
  sealed trait load
    extends StObject
       with LocationKind
  inline def load: load = "load".asInstanceOf[load]
  
  @js.native
  sealed trait next
    extends StObject
       with LocationKind
  inline def next: next = "next".asInstanceOf[next]
  
  @js.native
  sealed trait pop
    extends StObject
       with LocationKind
  inline def pop: pop = "pop".asInstanceOf[pop]
  
  @js.native
  sealed trait push
    extends StObject
       with LocationKind
  inline def push: push = "push".asInstanceOf[push]
  
  @js.native
  sealed trait redirect
    extends StObject
       with LocationKind
  inline def redirect: redirect = "redirect".asInstanceOf[redirect]
  
  @js.native
  sealed trait replace
    extends StObject
       with LocationKind
  inline def replace: replace = "replace".asInstanceOf[replace]
  
  @js.native
  sealed trait stealth
    extends StObject
       with LocationKind
  inline def stealth: stealth = "stealth".asInstanceOf[stealth]
}
