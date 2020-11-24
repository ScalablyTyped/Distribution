package typings.prompts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Answers[T /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ id in T ]: any}
    */ typings.prompts.promptsStrings.Answers with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type Falsy = js.UndefOr[typings.prompts.promptsBooleans.`false` | scala.Null]
  
  type PrevCaller[T /* <: java.lang.String */, R] = js.Function3[
    /* prev */ js.Any, 
    /* values */ typings.prompts.mod.Answers[T], 
    /* prompt */ typings.prompts.mod.PromptObject[java.lang.String], 
    R
  ]
  
  type ValueOrFunc[T /* <: java.lang.String */] = T | (typings.prompts.mod.PrevCaller[T, T])
}
