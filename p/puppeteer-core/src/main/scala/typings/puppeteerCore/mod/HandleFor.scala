package typings.puppeteerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends std.Node ? puppeteer-core.puppeteer-core.ElementHandle<T> : puppeteer-core.puppeteer-core.JSHandle<T>
  }}}
  */
@js.native
trait HandleFor[T]
  extends StObject
     with _HandleOr[T]
