organization := "org.scalablytyped"
name := "react-intl"
version := "3.6.2-3fbde7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "1.2.4-907283",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "4.4.3-dad73d",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "2.1.4-097e67",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "1.4.2-85a0e0",
  "org.scalablytyped" %%% "intl-messageformat" % "7.5.5-ae3977",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "3.2.4-ace0fc",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191123Z-d1d56f",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        