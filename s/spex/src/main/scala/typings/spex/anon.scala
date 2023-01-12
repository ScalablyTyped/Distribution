package typings.spex

import org.scalablytyped.runtime.Instantiable0
import typings.spex.mod.errors.BatchError
import typings.spex.mod.errors.PageError
import typings.spex.mod.errors.SequenceError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cb extends StObject {
    
    var cb: js.UndefOr[
        js.Function4[/* index */ Double, /* success */ Boolean, /* result */ Any, /* delay */ Double, Any]
      ] = js.undefined
  }
  object Cb {
    
    inline def apply(): Cb = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cb]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cb] (val x: Self) extends AnyVal {
      
      inline def setCb(value: (/* index */ Double, /* success */ Boolean, /* result */ Any, /* delay */ Double) => Any): Self = StObject.set(x, "cb", js.Any.fromFunction4(value))
      
      inline def setCbUndefined: Self = StObject.set(x, "cb", js.undefined)
    }
  }
  
  trait Dest extends StObject {
    
    var dest: js.UndefOr[js.Function3[/* index */ Double, /* data */ Any, /* delay */ Double, Any]] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
  }
  object Dest {
    
    inline def apply(): Dest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dest] (val x: Self) extends AnyVal {
      
      inline def setDest(value: (/* index */ Double, /* data */ Any, /* delay */ Double) => Any): Self = StObject.set(x, "dest", js.Any.fromFunction3(value))
      
      inline def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
  
  trait Limit extends StObject {
    
    var dest: js.UndefOr[js.Function3[/* index */ Double, /* data */ Any, /* delay */ Double, Any]] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var track: js.UndefOr[Boolean] = js.undefined
  }
  object Limit {
    
    inline def apply(): Limit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Limit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Limit] (val x: Self) extends AnyVal {
      
      inline def setDest(value: (/* index */ Double, /* data */ Any, /* delay */ Double) => Any): Self = StObject.set(x, "dest", js.Any.fromFunction3(value))
      
      inline def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setTrack(value: Boolean): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    }
  }
  
  trait Typeoferrors extends StObject {
    
    // API: http://vitaly-t.github.io/spex/errors.BatchError.html
    var BatchError: Instantiable0[typings.spex.mod.errors.BatchError]
    
    // API: http://vitaly-t.github.io/spex/errors.PageError.html
    var PageError: Instantiable0[typings.spex.mod.errors.PageError]
    
    // API: http://vitaly-t.github.io/spex/errors.SequenceError.html
    var SequenceError: Instantiable0[typings.spex.mod.errors.SequenceError]
  }
  object Typeoferrors {
    
    inline def apply(
      BatchError: Instantiable0[BatchError],
      PageError: Instantiable0[PageError],
      SequenceError: Instantiable0[SequenceError]
    ): Typeoferrors = {
      val __obj = js.Dynamic.literal(BatchError = BatchError.asInstanceOf[js.Any], PageError = PageError.asInstanceOf[js.Any], SequenceError = SequenceError.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeoferrors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Typeoferrors] (val x: Self) extends AnyVal {
      
      inline def setBatchError(value: Instantiable0[BatchError]): Self = StObject.set(x, "BatchError", value.asInstanceOf[js.Any])
      
      inline def setPageError(value: Instantiable0[PageError]): Self = StObject.set(x, "PageError", value.asInstanceOf[js.Any])
      
      inline def setSequenceError(value: Instantiable0[SequenceError]): Self = StObject.set(x, "SequenceError", value.asInstanceOf[js.Any])
    }
  }
}
