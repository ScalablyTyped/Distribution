package typings.random

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def bates(): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("bates")().asInstanceOf[js.Function0[Double]]
  @scala.inline
  def bates(n: Double): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("bates")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Double]]
  
  @scala.inline
  def bernoulli(): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("bernoulli")().asInstanceOf[js.Function0[Double]]
  @scala.inline
  def bernoulli(p: Double): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("bernoulli")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Double]]
  
  @scala.inline
  def binomial(): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("binomial")().asInstanceOf[js.Function0[Double]]
  @scala.inline
  def binomial(n: Double): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("binomial")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Double]]
  @scala.inline
  def binomial(n: Double, p: Double): js.Function0[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("binomial")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Double]]
  @scala.inline
  def binomial(n: Unit, p: Double): js.Function0[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("binomial")(n.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Double]]
  
  @scala.inline
  def bool(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("bool")().asInstanceOf[Boolean]
  
  @scala.inline
  def boolean(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("boolean")().asInstanceOf[Boolean]
  
  @scala.inline
  def exponential(): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("exponential")().asInstanceOf[js.Function0[Double]]
  @scala.inline
  def exponential(lambda: Double): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("exponential")(lambda.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Double]]
  
  @scala.inline
  def float(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("float")().asInstanceOf[Double]
  @scala.inline
  def float(min: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("float")(min.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def float(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("float")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def float(min: Unit, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("float")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def geometric(): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("geometric")().asInstanceOf[js.Function0[Double]]
  @scala.inline
  def geometric(p: Double): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("geometric")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Double]]
  
  @scala.inline
  def int(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("int")().asInstanceOf[Double]
  @scala.inline
  def int(min: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("int")(min.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def int(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("int")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def int(min: Unit, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("int")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def irwinHall(): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("irwinHall")().asInstanceOf[js.Function0[Double]]
  @scala.inline
  def irwinHall(n: Double): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("irwinHall")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Double]]
  
  @scala.inline
  def logNormal(): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("logNormal")().asInstanceOf[js.Function0[Double]]
  @scala.inline
  def logNormal(mu: Double): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("logNormal")(mu.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Double]]
  @scala.inline
  def logNormal(mu: Double, sigma: Double): js.Function0[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("logNormal")(mu.asInstanceOf[js.Any], sigma.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Double]]
  @scala.inline
  def logNormal(mu: Unit, sigma: Double): js.Function0[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("logNormal")(mu.asInstanceOf[js.Any], sigma.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Double]]
  
  @scala.inline
  def normal(): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("normal")().asInstanceOf[js.Function0[Double]]
  @scala.inline
  def normal(mu: Double): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("normal")(mu.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Double]]
  @scala.inline
  def normal(mu: Double, sigma: Double): js.Function0[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("normal")(mu.asInstanceOf[js.Any], sigma.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Double]]
  @scala.inline
  def normal(mu: Unit, sigma: Double): js.Function0[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("normal")(mu.asInstanceOf[js.Any], sigma.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Double]]
  
  @scala.inline
  def pareto(): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("pareto")().asInstanceOf[js.Function0[Double]]
  @scala.inline
  def pareto(alpha: Double): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("pareto")(alpha.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Double]]
  
  @scala.inline
  def patch(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("patch")().asInstanceOf[Unit]
  
  @scala.inline
  def poisson(): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("poisson")().asInstanceOf[js.Function0[Double]]
  @scala.inline
  def poisson(lambda: Double): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("poisson")(lambda.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Double]]
  
  @scala.inline
  def uniform(): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniform")().asInstanceOf[js.Function0[Double]]
  @scala.inline
  def uniform(min: Double): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniform")(min.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Double]]
  @scala.inline
  def uniform(min: Double, max: Double): js.Function0[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Double]]
  @scala.inline
  def uniform(min: Unit, max: Double): js.Function0[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Double]]
  
  @scala.inline
  def uniformBoolean(): js.Function0[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniformBoolean")().asInstanceOf[js.Function0[Boolean]]
  
  @scala.inline
  def uniformInt(): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniformInt")().asInstanceOf[js.Function0[Double]]
  @scala.inline
  def uniformInt(min: Double): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniformInt")(min.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Double]]
  @scala.inline
  def uniformInt(min: Double, max: Double): js.Function0[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniformInt")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Double]]
  @scala.inline
  def uniformInt(min: Unit, max: Double): js.Function0[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniformInt")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Double]]
  
  @scala.inline
  def unpatch(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unpatch")().asInstanceOf[Unit]
  
  @scala.inline
  def use(n: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(n.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def use(n: js.Function0[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(n.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def use(n: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(n.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def use(n: RNG): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(n.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait RNG extends StObject {
    
    def clone(seed: Double, opts: js.Object): RNG
    
    var name: String
    
    def next(): Double
    
    def seed(seed: Double, opts: js.Object): Unit
  }
  object RNG {
    
    @scala.inline
    def apply(
      clone_ : (Double, js.Object) => RNG,
      name: String,
      next: () => Double,
      seed: (Double, js.Object) => Unit
    ): RNG = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), seed = js.Any.fromFunction2(seed))
      __obj.updateDynamic("clone")(js.Any.fromFunction2(clone_))
      __obj.asInstanceOf[RNG]
    }
    
    @scala.inline
    implicit class RNGMutableBuilder[Self <: RNG] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClone_(value: (Double, js.Object) => RNG): Self = StObject.set(x, "clone", js.Any.fromFunction2(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext(value: () => Double): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSeed(value: (Double, js.Object) => Unit): Self = StObject.set(x, "seed", js.Any.fromFunction2(value))
    }
  }
}
