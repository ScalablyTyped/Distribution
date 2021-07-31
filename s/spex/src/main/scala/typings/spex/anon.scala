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
        js.Function4[
          /* index */ Double, 
          /* success */ Boolean, 
          /* result */ js.Any, 
          /* delay */ Double, 
          js.Any
        ]
      ] = js.undefined
  }
  object Cb {
    
    @scala.inline
    def apply(): Cb = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cb]
    }
    
    @scala.inline
    implicit class CbMutableBuilder[Self <: Cb] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCb(
        value: (/* index */ Double, /* success */ Boolean, /* result */ js.Any, /* delay */ Double) => js.Any
      ): Self = StObject.set(x, "cb", js.Any.fromFunction4(value))
      
      @scala.inline
      def setCbUndefined: Self = StObject.set(x, "cb", js.undefined)
    }
  }
  
  trait Dest extends StObject {
    
    var dest: js.UndefOr[js.Function3[/* index */ Double, /* data */ js.Any, /* delay */ Double, js.Any]] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
  }
  object Dest {
    
    @scala.inline
    def apply(): Dest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dest]
    }
    
    @scala.inline
    implicit class DestMutableBuilder[Self <: Dest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDest(value: (/* index */ Double, /* data */ js.Any, /* delay */ Double) => js.Any): Self = StObject.set(x, "dest", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
  
  trait Limit extends StObject {
    
    var dest: js.UndefOr[js.Function3[/* index */ Double, /* data */ js.Any, /* delay */ Double, js.Any]] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var track: js.UndefOr[Boolean] = js.undefined
  }
  object Limit {
    
    @scala.inline
    def apply(): Limit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Limit]
    }
    
    @scala.inline
    implicit class LimitMutableBuilder[Self <: Limit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDest(value: (/* index */ Double, /* data */ js.Any, /* delay */ Double) => js.Any): Self = StObject.set(x, "dest", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setTrack(value: Boolean): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
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
    
    @scala.inline
    def apply(
      BatchError: Instantiable0[BatchError],
      PageError: Instantiable0[PageError],
      SequenceError: Instantiable0[SequenceError]
    ): Typeoferrors = {
      val __obj = js.Dynamic.literal(BatchError = BatchError.asInstanceOf[js.Any], PageError = PageError.asInstanceOf[js.Any], SequenceError = SequenceError.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeoferrors]
    }
    
    @scala.inline
    implicit class TypeoferrorsMutableBuilder[Self <: Typeoferrors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchError(value: Instantiable0[BatchError]): Self = StObject.set(x, "BatchError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageError(value: Instantiable0[PageError]): Self = StObject.set(x, "PageError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceError(value: Instantiable0[SequenceError]): Self = StObject.set(x, "SequenceError", value.asInstanceOf[js.Any])
    }
  }
}
