package typings.rcloader

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rcloader", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with RcLoader {
    def this(configfilename: String, options: String) = this()
    def this(configfilename: String, options: Options) = this()
  }
  
  trait Options
    extends StObject
       with /* property */ StringDictionary[Any] {
    
    var lookup: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setLookup(value: Boolean): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
      
      inline def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
    }
  }
  
  @js.native
  trait RcLoader extends StObject {
    
    def `for`(path: String): Unit = js.native
    def `for`(path: String, callback: js.Function2[/* error */ Any, /* fileOpts */ Any, Unit]): Unit = js.native
  }
}
