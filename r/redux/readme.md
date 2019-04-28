
# Scala.js typings for redux

Typings are for version 4.0.1

## Library description:
Predictable state container for JavaScript apps

|                    |                 |
| ------------------ | :-------------: |
| Full name          | redux |
| Keywords           | redux, reducer, state, predictable, functional, immutable, hot, live, replay, flux, elm |
| # releases         | 9 |
| # dependents       | 5818 |
| # downloads        | 113415680 |
| # stars            | 246 |

## Links
- [Homepage](http://redux.js.org)
- [Bugs](https://github.com/reduxjs/redux/issues)
- [Repository](https://github.com/reduxjs/redux)
- [Npm](https://www.npmjs.com/package/redux)
    


## Note
This library has been generated from typescript code from first party type definitions.

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
/**
 * An *action* is a plain object that represents an intention to change the
 * state. Actions are the only way to get data into the store. Any data,
 * whether from UI events, network callbacks, or other sources such as
 * WebSockets needs to eventually be dispatched as actions.
 *
 * Actions must have a `type` field that indicates the type of action being
 * performed. Types can be defined as constants and imported from another
 * module. It's better to use strings for `type` than Symbols because strings
 * are serializable.
 *
 * Other than `type`, the structure of an action object is really up to you.
 * If you're interested, check out Flux Standard Action for recommendations on
 * how actions should be constructed.
 *
 * @template T the type of the action's `type` tag.
 */

```

