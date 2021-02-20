package typings.sinon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// sinon uses DOM dependencies which are absent in browser-less environment like node.js
// to avoid compiler errors this monkey patch is used
// see more details in https://github.com/DefinitelyTyped/DefinitelyTyped/issues/11351
@js.native
trait Event extends StObject
