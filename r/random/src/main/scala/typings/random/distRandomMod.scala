package typings.random

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRandomMod {
  
  @JSImport("random/dist/random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("random/dist/random", JSImport.Default)
  @js.native
  val default: Random = js.native
  
  /* note: abstract class */ @JSImport("random/dist/random", "RNG")
  @js.native
  open class RNG ()
    extends typings.random.distRngMod.default
  
  /**
    * Construct an RNG with variable inputs. Used in calls to Random constructor
    * @param {...*} args - Distribution-specific arguments
    * @return RNG
    *
    * @example
    * new Random(RNGFactory(...args))
    */
  inline def RNGFactory[T /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): typings.random.distRngMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("RNGFactory")(args.asInstanceOf[js.Any]).asInstanceOf[typings.random.distRngMod.default]
  
  @JSImport("random/dist/random", "Random")
  @js.native
  open class Random () extends StObject {
    def this(rng: typings.random.distRngMod.default) = this()
    
    /* protected */ var _cache: StringDictionary[ICacheEntry[Any]] = js.native
    
    /**
      * Memoizes distributions to ensure they're only created when necessary.
      *
      * Returns a thunk which that returns independent, identically distributed
      * samples from the specified distribution.
      *
      * @private
      *
      * @param {string} label - Name of distribution
      * @param {function} getter - Function which generates a new distribution
      * @param {...*} args - Distribution-specific arguments
      *
      * @return {function}
      */
    def _memoize[T](label: String, getter: IDistFn[Any], args: Any*): IDist[T] = js.native
    
    /* protected */ var _patch: js.UndefOr[js.Function0[Double]] = js.native
    
    /* protected */ var _rng: typings.random.distRngMod.default = js.native
    
    /**
      * Generates a [Bates distribution](https://en.wikipedia.org/wiki/Bates_distribution).
      *
      * @param {number} [n=1] - Number of uniform samples to average (n >= 1)
      * @return {function}
      */
    def bates(): js.Function0[Double] = js.native
    def bates(n: Double): js.Function0[Double] = js.native
    
    /**
      * Generates a [Bernoulli distribution](https://en.wikipedia.org/wiki/Bernoulli_distribution).
      *
      * @param {number} [p=0.5] - Success probability of each trial.
      * @return {function}
      */
    def bernoulli(): js.Function0[Double] = js.native
    def bernoulli(p: Double): js.Function0[Double] = js.native
    
    /**
      * Generates a [Binomial distribution](https://en.wikipedia.org/wiki/Binomial_distribution).
      *
      * @param {number} [n=1] - Number of trials.
      * @param {number} [p=0.5] - Success probability of each trial.
      * @return {function}
      */
    def binomial(): js.Function0[Double] = js.native
    def binomial(n: Double): js.Function0[Double] = js.native
    def binomial(n: Double, p: Double): js.Function0[Double] = js.native
    def binomial(n: Unit, p: Double): js.Function0[Double] = js.native
    
    /**
      * Samples a uniform random boolean value.
      *
      * Convence wrapper around `random.uniformBoolean()`
      *
      * @alias `random.boolean`
      *
      * @return {boolean}
      */
    def bool(): Boolean = js.native
    
    /**
      * Samples a uniform random boolean value.
      *
      * Convence wrapper around `random.uniformBoolean()`
      *
      * @return {boolean}
      */
    def boolean(): Boolean = js.native
    
    /**
      * Creates a new `Random` instance, optionally specifying parameters to
      * set a new seed.
      *
      * @see RNG.clone
      *
      * @param {string} [seed] - Optional seed for new RNG.
      * @param {object} [opts] - Optional config for new RNG options.
      * @return {Random}
      */
    def clone[T](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [T] is not an array type */ args: js.Array[T]
    ): Random = js.native
    
    /**
      * Generates an [Exponential distribution](https://en.wikipedia.org/wiki/Exponential_distribution).
      *
      * @param {number} [lambda=1] - Inverse mean (lambda > 0)
      * @return {function}
      */
    def exponential(): js.Function0[Double] = js.native
    def exponential(lambda: Double): js.Function0[Double] = js.native
    
    /**
      * Samples a uniform random floating point number, optionally specifying
      * lower and upper bounds.
      *
      * Convence wrapper around `random.uniform()`
      *
      * @param {number} [min=0] - Lower bound (float, inclusive)
      * @param {number} [max=1] - Upper bound (float, exclusive)
      * @return {number}
      */
    def float(): Double = js.native
    def float(min: Double): Double = js.native
    def float(min: Double, max: Double): Double = js.native
    def float(min: Unit, max: Double): Double = js.native
    
    /**
      * Generates a [Geometric distribution](https://en.wikipedia.org/wiki/Geometric_distribution).
      *
      * @param {number} [p=0.5] - Success probability of each trial.
      * @return {function}
      */
    def geometric(): js.Function0[Double] = js.native
    def geometric(p: Double): js.Function0[Double] = js.native
    
    /**
      * Samples a uniform random integer, optionally specifying lower and upper
      * bounds.
      *
      * Convence wrapper around `random.uniformInt()`
      *
      * @param {number} [min=0] - Lower bound (integer, inclusive)
      * @param {number} [max=1] - Upper bound (integer, inclusive)
      * @return {number}
      */
    def int(): Double = js.native
    def int(min: Double): Double = js.native
    def int(min: Double, max: Double): Double = js.native
    def int(min: Unit, max: Double): Double = js.native
    
    /**
      * Samples a uniform random integer, optionally specifying lower and upper
      * bounds.
      *
      * Convence wrapper around `random.uniformInt()`
      *
      * @alias `random.int`
      *
      * @param {number} [min=0] - Lower bound (integer, inclusive)
      * @param {number} [max=1] - Upper bound (integer, inclusive)
      * @return {number}
      */
    def integer(): Double = js.native
    def integer(min: Double): Double = js.native
    def integer(min: Double, max: Double): Double = js.native
    def integer(min: Unit, max: Double): Double = js.native
    
    /**
      * Generates an [Irwin Hall distribution](https://en.wikipedia.org/wiki/Irwin%E2%80%93Hall_distribution).
      *
      * @param {number} [n=1] - Number of uniform samples to sum (n >= 0)
      * @return {function}
      */
    def irwinHall(): js.Function0[Double] = js.native
    def irwinHall(n: Double): js.Function0[Double] = js.native
    
    /**
      * Generates a [Log-normal distribution](https://en.wikipedia.org/wiki/Log-normal_distribution).
      *
      * @param {number} [mu=0] - Mean of underlying normal distribution
      * @param {number} [sigma=1] - Standard deviation of underlying normal distribution
      * @return {function}
      */
    def logNormal(): js.Function0[Double] = js.native
    def logNormal(mu: Double): js.Function0[Double] = js.native
    def logNormal(mu: Double, sigma: Double): js.Function0[Double] = js.native
    def logNormal(mu: Unit, sigma: Double): js.Function0[Double] = js.native
    
    /**
      * Convenience wrapper around `this.rng.next()`
      *
      * Returns a floating point number in [0, 1).
      *
      * @return {number}
      */
    def next(): Double = js.native
    
    /**
      * Generates a [Normal distribution](https://en.wikipedia.org/wiki/Normal_distribution).
      *
      * @param {number} [mu=0] - Mean
      * @param {number} [sigma=1] - Standard deviation
      * @return {function}
      */
    def normal(): js.Function0[Double] = js.native
    def normal(mu: Double): js.Function0[Double] = js.native
    def normal(mu: Double, sigma: Double): js.Function0[Double] = js.native
    def normal(mu: Unit, sigma: Double): js.Function0[Double] = js.native
    
    /**
      * Generates a [Pareto distribution](https://en.wikipedia.org/wiki/Pareto_distribution).
      *
      * @param {number} [alpha=1] - Alpha
      * @return {function}
      */
    def pareto(): js.Function0[Double] = js.native
    def pareto(alpha: Double): js.Function0[Double] = js.native
    
    /**
      * Patches `Math.random` with this Random instance's PRNG.
      */
    def patch(): Unit = js.native
    
    /**
      * Generates a [Poisson distribution](https://en.wikipedia.org/wiki/Poisson_distribution).
      *
      * @param {number} [lambda=1] - Mean (lambda > 0)
      * @return {function}
      */
    def poisson(): js.Function0[Double] = js.native
    def poisson(lambda: Double): js.Function0[Double] = js.native
    
    /**
      * @member {RNG} Underlying pseudo-random number generator
      */
    def rng: typings.random.distRngMod.default = js.native
    
    /**
      * Generates a [Continuous uniform distribution](https://en.wikipedia.org/wiki/Uniform_distribution_(continuous)).
      *
      * @param {number} [min=0] - Lower bound (float, inclusive)
      * @param {number} [max=1] - Upper bound (float, exclusive)
      * @return {function}
      */
    def uniform(): IDist[Double] = js.native
    def uniform(min: Double): IDist[Double] = js.native
    def uniform(min: Double, max: Double): IDist[Double] = js.native
    def uniform(min: Unit, max: Double): IDist[Double] = js.native
    
    /**
      * Generates a [Discrete uniform distribution](https://en.wikipedia.org/wiki/Discrete_uniform_distribution),
      * with two possible outcomes, `true` or `false.
      *
      * This method is analogous to flipping a coin.
      *
      * @return {function}
      */
    def uniformBoolean(): IDist[Boolean] = js.native
    
    /**
      * Generates a [Discrete uniform distribution](https://en.wikipedia.org/wiki/Discrete_uniform_distribution).
      *
      * @param {number} [min=0] - Lower bound (integer, inclusive)
      * @param {number} [max=1] - Upper bound (integer, inclusive)
      * @return {function}
      */
    def uniformInt(): IDist[Double] = js.native
    def uniformInt(min: Double): IDist[Double] = js.native
    def uniformInt(min: Double, max: Double): IDist[Double] = js.native
    def uniformInt(min: Unit, max: Double): IDist[Double] = js.native
    
    /**
      * Restores a previously patched `Math.random` to its original value.
      */
    def unpatch(): Unit = js.native
    
    /**
      * Sets the underlying pseudorandom number generator used via
      * either an instance of `seedrandom`, a custom instance of RNG
      * (for PRNG plugins), or a string specifying the PRNG to use
      * along with an optional `seed` and `opts` to initialize the
      * RNG.
      *
      * @example
      * import random from 'random'
      *
      * random.use('example_seedrandom_string')
      * // or
      * random.use(seedrandom('kittens'))
      * // or
      * random.use(Math.random)
      *
      * @param {...*} args
      */
    def use(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [RNG] is not an array type */ args: js.Array[typings.random.distRngMod.default]
    ): Unit = js.native
  }
  
  /**
    * Keyed cache entry
    */
  trait ICacheEntry[T] extends StObject {
    
    def distribution(): T
    
    var key: String
  }
  object ICacheEntry {
    
    inline def apply[T](distribution: () => T, key: String): ICacheEntry[T] = {
      val __obj = js.Dynamic.literal(distribution = js.Any.fromFunction0(distribution), key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICacheEntry[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICacheEntry[?], T] (val x: Self & ICacheEntry[T]) extends AnyVal {
      
      inline def setDistribution(value: () => T): Self = StObject.set(x, "distribution", js.Any.fromFunction0(value))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Distribution
    */
  type IDist[R] = js.Function0[R]
  
  /**
    * Distribution function
    */
  type IDistFn[R] = js.Function2[/* random */ Random, /* argv */ Any, R]
}
