package typings.spinnies

import typings.spinnies.mod.Color
import typings.spinnies.mod.SpinnerStatus
import typings.spinnies.mod.StopAllStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spinniesStrings {
  
  @js.native
  sealed trait black
    extends StObject
       with Color
  inline def black: black = "black".asInstanceOf[black]
  
  @js.native
  sealed trait blue
    extends StObject
       with Color
  inline def blue: blue = "blue".asInstanceOf[blue]
  
  @js.native
  sealed trait blueBright
    extends StObject
       with Color
  inline def blueBright: blueBright = "blueBright".asInstanceOf[blueBright]
  
  @js.native
  sealed trait cyan
    extends StObject
       with Color
  inline def cyan: cyan = "cyan".asInstanceOf[cyan]
  
  @js.native
  sealed trait cyanBright
    extends StObject
       with Color
  inline def cyanBright: cyanBright = "cyanBright".asInstanceOf[cyanBright]
  
  @js.native
  sealed trait fail
    extends StObject
       with SpinnerStatus
       with StopAllStatus
  inline def fail: fail = "fail".asInstanceOf[fail]
  
  @js.native
  sealed trait gray
    extends StObject
       with Color
  inline def gray: gray = "gray".asInstanceOf[gray]
  
  @js.native
  sealed trait green
    extends StObject
       with Color
  inline def green: green = "green".asInstanceOf[green]
  
  @js.native
  sealed trait greenBright
    extends StObject
       with Color
  inline def greenBright: greenBright = "greenBright".asInstanceOf[greenBright]
  
  @js.native
  sealed trait magenta
    extends StObject
       with Color
  inline def magenta: magenta = "magenta".asInstanceOf[magenta]
  
  @js.native
  sealed trait magentaBright
    extends StObject
       with Color
  inline def magentaBright: magentaBright = "magentaBright".asInstanceOf[magentaBright]
  
  @js.native
  sealed trait `non-spinnable`
    extends StObject
       with SpinnerStatus
  inline def `non-spinnable`: `non-spinnable` = "non-spinnable".asInstanceOf[`non-spinnable`]
  
  @js.native
  sealed trait red
    extends StObject
       with Color
  inline def red: red = "red".asInstanceOf[red]
  
  @js.native
  sealed trait redBright
    extends StObject
       with Color
  inline def redBright: redBright = "redBright".asInstanceOf[redBright]
  
  @js.native
  sealed trait spinning
    extends StObject
       with SpinnerStatus
  inline def spinning: spinning = "spinning".asInstanceOf[spinning]
  
  @js.native
  sealed trait stopped
    extends StObject
       with SpinnerStatus
       with StopAllStatus
  inline def stopped: stopped = "stopped".asInstanceOf[stopped]
  
  @js.native
  sealed trait succeed
    extends StObject
       with SpinnerStatus
       with StopAllStatus
  inline def succeed: succeed = "succeed".asInstanceOf[succeed]
  
  @js.native
  sealed trait white
    extends StObject
       with Color
  inline def white: white = "white".asInstanceOf[white]
  
  @js.native
  sealed trait whiteBright
    extends StObject
       with Color
  inline def whiteBright: whiteBright = "whiteBright".asInstanceOf[whiteBright]
  
  @js.native
  sealed trait yellow
    extends StObject
       with Color
  inline def yellow: yellow = "yellow".asInstanceOf[yellow]
  
  @js.native
  sealed trait yellowBright
    extends StObject
       with Color
  inline def yellowBright: yellowBright = "yellowBright".asInstanceOf[yellowBright]
}
