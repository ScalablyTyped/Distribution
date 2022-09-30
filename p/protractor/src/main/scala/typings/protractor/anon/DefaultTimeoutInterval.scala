package typings.protractor.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultTimeoutInterval
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /**
    * Default time to wait in ms before a test fails.
    */
  var defaultTimeoutInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * If set, only execute specs whose names match the pattern, which is
    * internally compiled to a RegExp.
    */
  var grep: js.UndefOr[String] = js.undefined
  
  /**
    * Inverts 'grep' matches
    */
  var invertGrep: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Function called to print jasmine results.
    */
  var print: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * If true, run specs in semi-random order
    */
  var random: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the randomization seed if randomization is turned on
    */
  var seed: js.UndefOr[String] = js.undefined
  
  /**
    * If true, print colors to the terminal.
    */
  var showColors: js.UndefOr[Boolean] = js.undefined
}
object DefaultTimeoutInterval {
  
  inline def apply(): DefaultTimeoutInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultTimeoutInterval]
  }
  
  extension [Self <: DefaultTimeoutInterval](x: Self) {
    
    inline def setDefaultTimeoutInterval(value: Double): Self = StObject.set(x, "defaultTimeoutInterval", value.asInstanceOf[js.Any])
    
    inline def setDefaultTimeoutIntervalUndefined: Self = StObject.set(x, "defaultTimeoutInterval", js.undefined)
    
    inline def setGrep(value: String): Self = StObject.set(x, "grep", value.asInstanceOf[js.Any])
    
    inline def setGrepUndefined: Self = StObject.set(x, "grep", js.undefined)
    
    inline def setInvertGrep(value: Boolean): Self = StObject.set(x, "invertGrep", value.asInstanceOf[js.Any])
    
    inline def setInvertGrepUndefined: Self = StObject.set(x, "invertGrep", js.undefined)
    
    inline def setPrint(value: () => Unit): Self = StObject.set(x, "print", js.Any.fromFunction0(value))
    
    inline def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
    
    inline def setRandom(value: Boolean): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
    
    inline def setRandomUndefined: Self = StObject.set(x, "random", js.undefined)
    
    inline def setSeed(value: String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    
    inline def setShowColors(value: Boolean): Self = StObject.set(x, "showColors", value.asInstanceOf[js.Any])
    
    inline def setShowColorsUndefined: Self = StObject.set(x, "showColors", js.undefined)
  }
}
