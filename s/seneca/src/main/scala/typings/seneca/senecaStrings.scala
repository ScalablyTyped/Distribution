package typings.seneca

import typings.seneca.mod.LogLevel
import typings.seneca.mod.LogSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object senecaStrings {
  
  @js.native
  sealed trait all
    extends StObject
       with LogSpec
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait any
    extends StObject
       with LogSpec
  inline def any: any = "any".asInstanceOf[any]
  
  @js.native
  sealed trait debugPlussign
    extends StObject
       with LogLevel
  inline def debugPlussign: debugPlussign = "debug+".asInstanceOf[debugPlussign]
  
  @js.native
  sealed trait infoPlussign
    extends StObject
       with LogLevel
  inline def infoPlussign: infoPlussign = "info+".asInstanceOf[infoPlussign]
  
  @js.native
  sealed trait none
    extends StObject
       with LogLevel
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait print
    extends StObject
       with LogSpec
  inline def print: print = "print".asInstanceOf[print]
  
  @js.native
  sealed trait quiet
    extends StObject
       with LogSpec
  inline def quiet: quiet = "quiet".asInstanceOf[quiet]
  
  @js.native
  sealed trait silent
    extends StObject
       with LogSpec
  inline def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait standard
    extends StObject
       with LogSpec
  inline def standard: standard = "standard".asInstanceOf[standard]
  
  @js.native
  sealed trait test
    extends StObject
       with LogSpec
  inline def test: test = "test".asInstanceOf[test]
  
  @js.native
  sealed trait warnPlussign
    extends StObject
       with LogLevel
  inline def warnPlussign: warnPlussign = "warn+".asInstanceOf[warnPlussign]
}
