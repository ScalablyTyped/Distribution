
# Scala.js typings for screeps-profiler

Typings are for version 1.2

## Library description:
A profiler designed for use in the game of Screeps.

|                    |                 |
| ------------------ | :-------------: |
| Full name          | screeps-profiler |
| Keywords           | screeps, profiler |
| # releases         | 4 |
| # dependents       | 1 |
| # downloads        | 1307 |
| # stars            | 0 |

## Links
- [Homepage](https://github.com/screepers/screeps-profiler#readme)
- [Bugs](https://github.com/screepers/screeps-profiler/issues)
- [Repository](https://github.com/screepers/screeps-profiler)
- [Npm](https://www.npmjs.com/package/screeps-profiler)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for screeps-profiler 1.2
// Project: https://github.com/screepers/screeps-profiler
// Definitions by: Casey Link <https://github.com/ramblurr>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
/**
 * The Screeps Profiler is a library that helps to understand where your CPU is being spent in
 * the game of Screeps.
 * It works by monkey patching functions on the Global game object prototypes, with a function that
 * record how long each function takes. The primary benefit of using this profiler is that you can
 * get a clear picture of where your CPU is being used over time, and optimize some of the heavier functions.
 * While it works best for players that heavily employ prototypes in their code, it should work
 * to some degree for all players.
 *
 * Any modules that you use that modify the game's prototypes should be imported
 * before you require the profiler.
 *
 * @see More information at https://github.com/gdborton/screeps-profiler
 */

```

